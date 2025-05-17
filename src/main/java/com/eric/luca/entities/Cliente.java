package com.eric.luca.entities;

public class Cliente extends Persona {
	
	String email;

	public Cliente(int id, String nombre, String email) {
		super(id, nombre);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", getEmail()=" + getEmail() + ", getNombre()=" + getNombre() + ", getId()="
				+ getId() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
