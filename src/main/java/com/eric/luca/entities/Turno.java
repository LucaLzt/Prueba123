package com.eric.luca.entities;

public class Turno {
	
	private int id;
	private String tipo;
	private float precio;
	
	public int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Turno [id=" + id + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	
	
}
