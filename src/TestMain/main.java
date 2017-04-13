package TestMain;

import Models.Cola;
import Models.Futbolista;

public class main {
	
	
	public static void main(String[] args) {
		
   // jugadores que juegan
		
		Futbolista a1 = new Futbolista("Messi", 50);
		Futbolista a2 = new Futbolista("Cristiano", 75);
		Futbolista a3 = new Futbolista("Benzema", 21);
		Futbolista a4 = new Futbolista("Dani Alves", 45);
		Futbolista a5 = new Futbolista("Luis Suarez", 100);

		Cola<Futbolista> co = new Cola<Futbolista>();
		
		// Añadimos a los jugadores
		
		co.push(a1);
		co.push(a2);
		co.push(a3);
		co.push(a4);
		co.push(a5);
	
		// FIFO por defecto
		
		// Imprime Messi
		
		System.out.println("Messi");
		
		System.out.println(co.pop().getNombre());
		
		// Cambia a LIFO
		co.setClassMode();
		
		// Imprime Suarez
		System.out.println("Suarez");
		System.out.println(co.pop().getNombre());
	
		// Cambia a FIFO
		co.setClassMode();
		
		// Imprime Cristiano
		
		System.out.println("Cristiano");
		System.out.println(co.pop().getNombre());

		System.out.println(co.size());
		
	}

}
