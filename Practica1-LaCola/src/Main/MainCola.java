package Main;

import Models.*;

public class MainCola {

	public static void main(String args[]) {

		Cola<Coche> cola = new Cola<Coche>();

		// Creamos varios coches para añadirlos a la cola
		Coche coche1 = new Coche("BMW", "535", 2015);
		Coche coche2 = new Coche("Audi", "Q7", 2017);
		Coche coche3 = new Coche("Mercedes", "CLA", 2009);

		// Añadimos los coches a la cola
		cola.push(coche1);
		cola.push(coche2);
		cola.push(coche3);

		// Eliminamos un elemento de la cola
		cola.remove(coche1);

		// Dejamos la cola vacía
		cola.clear();

		// Mostramos la longitud de la cola
		System.out.println(cola.size());

	}
}
