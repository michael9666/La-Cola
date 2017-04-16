package Models;

import java.util.Arrays;

public class Cola<T> {

	// ATRIBUTOS
	private T[] elementos;
	private int longitud;

	// CONSTRUCTORES
	public Cola() {
		this.longitud = 0;
		this.elementos = (T[]) new Object[this.longitud];
	}

	// Método para añadir nuevos elementos a la cola
	public void push(T elementos) {
		this.elementos = Arrays.copyOf(this.elementos, this.longitud + 1);
		this.elementos[this.longitud++] = elementos;
	}

	// Método para eliminar el elemento de la cola
	public void remove(T elementos) {
		for (int i = 0; i < this.longitud; i++) {
			// Si el elemento que se desea eliminar es el mismo y está dentro de
			// la cola se eliminará
			if (this.elementos[i] == elementos) {
				this.elementos[i] = null;
				this.longitud--;
			}
			// Colocamos el elemento eliminado al final de la cola
			if (this.elementos[i] == null && i != this.longitud) {
				this.elementos[i] = this.elementos[i + 1];
				this.elementos[i + 1] = null;
			}
		}

		// Redimensionamos la cola
		this.elementos = Arrays.copyOf(this.elementos, this.longitud);
	}

	public T pop() {
		// Este método no he sabido hacerlo
		return null;
	}

	// Método booleano para comprobar si el elemento está dentro de la cola
	public boolean contains(T element) {
		for (T e : this.elementos) {
			if (e == element) {
				return true;
			}
		}
		return false;
	}

	// Método para vaciar la cola
	public void clear() {
		this.longitud = 0;
		this.elementos = (T[]) new Object[this.longitud];
	}

	// Método booleano para saber si la cola está vacía
	public boolean isEmpty() {
		return this.longitud == 0;
	}

	// Método para saber la longitud de la cola
	public int size() {
		System.out.print("La longitud de la cola es de: ");
		return this.longitud;
	}
}
