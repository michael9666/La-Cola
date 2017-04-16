package Main;

import Models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola<Coche> cola = new Cola<Coche>();

		// Creamos los coches
		Coche coche1 = new Coche("BMW", "530", 2015);
		Coche coche2 = new Coche("Audi", "Q7", 2016);
		Coche coche3 = new Coche("Porsche", "911", 2013);

		// Añadimos los coches a la cola
		cola.push(coche1);
		cola.push(coche2);
		cola.push(coche3);

		// Eliminamos un coche de la cola
		cola.remove(coche1);

		// Eliminamos todos los elementos y vaciamos la cola
		cola.clear();

		// Mostramos la longitud de la cola
		System.out.println(cola.size());
	}
}
