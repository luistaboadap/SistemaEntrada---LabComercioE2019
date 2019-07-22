package pe.edu.unsch.entities;
// Generated 16-jul-2019 11:02:14 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca implements java.io.Serializable {

	private int idmarca;
	private String nombre;
	private Set productos = new HashSet(0);

	public Marca() {
	}

	public Marca(int idmarca, String nombre) {
		this.idmarca = idmarca;
		this.nombre = nombre;
	}

	public Marca(int idmarca, String nombre, Set productos) {
		this.idmarca = idmarca;
		this.nombre = nombre;
		this.productos = productos;
	}

	public int getIdmarca() {
		return this.idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getProductos() {
		return this.productos;
	}

	public void setProductos(Set productos) {
		this.productos = productos;
	}

}
