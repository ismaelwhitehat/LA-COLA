package Models;

public class Futbolista {

	private int edad;
	private String nombre;
	private String equipo;
	private String jugador;
	
	
	public Futbolista(int edad, String nombre, String equipo, String jugador) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.equipo = equipo;
		this.jugador = jugador;
	}


	public Futbolista(String string, int i) {
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public String getJugador() {
		return jugador;
	}


	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
}
