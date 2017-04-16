package Models;

import java.util.Arrays;

public class Cola<T> {

	// 1. ATRIBUTOS
	private T[] elementos;
	private int longitud;

	// 2. CONSTRUCTORES

	public Cola() {
		this.elementos = (T[]) new Object[this.longitud];
		this.longitud = 0;
	}

	// 3. M�TODOS

	// M�todo para insertar elementos en el array
	public void push(T elementos) {
		this.elementos = Arrays.copyOf(this.elementos, this.longitud + 1);
		this.elementos[this.longitud++] = (T) elementos;
	}

	// M�todo parra borrar el elemento del array
	public void remove(T elementos) {
		for (int i = 0; i < this.longitud; i++) {
			// Se elimina el elemento que el usuario introduce si es el mismo
			// que hay en la cola
			if (this.elementos[i] == elementos) {
				this.elementos[i] = null;
				this.longitud--;
			}
			// El elemento que se ha eliminado se pone al final de la cola
			if (this.elementos[i] == null && i != this.longitud) {
				this.elementos[i] = this.elementos[i + 1];
				this.elementos[i + 1] = null;
			}
		}

		this.elementos = Arrays.copyOf(this.elementos, this.longitud);
	}

	// M�todo para eliminar el siguiente elemento de la cola
	public T pop() {
		// Este m�todo no he conseguido hacerlo.
		return null;
		// 
	}

	// M�todo para comprobar si el elemento est� dentro de la cola
	public boolean contains(T element) {
		for (T e : this.elementos) {
			if (e == element) {
				return true;
			}
		}
		return false;

	}

	// M�todo para borrar todos los elementos de la cola y dejarla vac�a
	public void clear() {	
		this.longitud=0;
		this.elementos = (T[]) new Object[this.longitud];
	}

	// M�todo booleano que devuelve true si el array est� vacio
	public boolean isEmpty() {
		return this.longitud == 0;
	}

	// M�todo para devolver la longitud de la cola
	public int size() {
		System.out.print("El tama�o de la cola es de: ");
		return this.longitud;
	}
}
