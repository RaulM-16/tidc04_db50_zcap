package cl.Inacap.zCapModel.dto;

import java.util.List;

public class Consola {
	
	private String nombre;
	private String marca;
	private int anioLanzamiento;
	private List<Juegos> juegos;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public List<Juegos> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<Juegos> juegos) {
		this.juegos = juegos;
	}
}
