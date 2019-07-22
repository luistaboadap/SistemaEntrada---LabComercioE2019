package pe.edu.unsch.entities;
// Generated 16-jul-2019 11:02:14 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private Integer idcategoria;
	private int estado;
	private int idedentificacion;
	private String nombre;
	private Set productos = new HashSet(0);

	public Categoria() {
	}

	public Categoria(int estado, int idedentificacion, String nombre) {
		this.estado = estado;
		this.idedentificacion = idedentificacion;
		this.nombre = nombre;
	}

	public Categoria(int estado, int idedentificacion, String nombre, Set productos) {
		this.estado = estado;
		this.idedentificacion = idedentificacion;
		this.nombre = nombre;
		this.productos = productos;
	}

	public Integer getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdedentificacion() {
		return this.idedentificacion;
	}

	public void setIdedentificacion(int idedentificacion) {
		this.idedentificacion = idedentificacion;
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
