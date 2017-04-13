package Models;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class Cola<T> {

	private T[] element;
	private int size;
	private boolean LIFO_MODE;

	public Cola() {
		
		//Reservará memoria para un array de 0 T
		//elemento.	
		
		this.size = 0;
		this.element = (T[]) new Object[this.size];
		this.LIFO_MODE = false;
	}
	
	// Metodos

	public void push(T element) {
		
		//Añadirá el elemento al array. Evidentemente
		//habrá que hacer una reserva de memoria para
		//añadir un elemento más. Lo añadirá al final de la
		//cola
		
		this.element = Arrays.copyOf(this.element, this.size + 1);
		this.element[this.size++] = element;
	}
	
	public void setClassMode() {
		this.LIFO_MODE = !this.LIFO_MODE;
	}

	public void remove(T element) {
		
		//Eliminará del array el elemento. Evidentemente
		//habrá que redimensionar el array al tamaño real.
	
		
		for (int i = 0; i < this.size; i++) {
			if (this.element[i] == element) {
				this.element[i] = null;
				this.size--;
			}
			
			if (this.element[i] == null && i != this.size) {
				this.element[i] = this.element[i + 1];
				this.element[i + 1] = null;
			}
		}

		// Redimensiona la cola
		this.element = Arrays.copyOf(this.element, this.size);

	}


	public T pop() {
		
		//Eliminará del array el siguiente elemento de la
		//cola. Evidentemente habrá que redimensionar el
		//array al tamaño real.
		
		if (this.size == 0) {
			throw new NullPointerException(this.element.getClass().getSimpleName() + " has no elements");
		}

		T tempElement;

		if (this.LIFO_MODE) {
			// Primer elemento
			int tempSize = this.size - 1;
			
			// Guardar el primer elemento
			tempElement = this.element[tempSize];
			
			// Borrar el primer elemento
			this.element[tempSize] = null;
			
			// Reduce el tamaño de la pila
			
			this.size--;
		
		} else {
			
			// Guardar el primer elemento de la cola en temp para luego devolverlo
			tempElement = this.element[0];

			// Borrar el primer elemento de la cola
			this.element[0] = null;

			// Reduce el tamaño de la cola 
			this.size--;

			// Posicionar el elemento null
			for (int i = 0; i < this.size; i++) {
				if (this.element[i] == null && i != this.size) {
					this.element[i] = this.element[i + 1];
					this.element[i + 1] = null;
				}
			}
		}

		// Redimensionar la cola / pila
		this.element = Arrays.copyOf(this.element, this.size);

		// Retornar el elemento almacenado en temp
		return tempElement;

	}
	public boolean contains(T element) {
		
		//Devuelve true si el elemento está en la
		//colección utilizando el equals de la clase T.

		
		for (T e : this.element) {
			if (e == element) {
				return true;
			}
		}

		return false;
	}

	
	public void clear() {
		
		//Eliminará del array todos los elementos y
		//dejará el array de tamaño 0.
		
		this.element = (T[]) new Object[this.size];
	}

	
	public boolean isEmpty() {
		
		//Devuelve true si el array está vacío.

		return this.size == 0;
	}
	
	
	public int size() {
		
		//Devuelve el tamaño de la cola.
		
		return this.size;
	}

}
