package com.nttdata.models;

public class Celular {
	private String numero;
	private String marca;
	
	public Celular() {
		super();
	}

	public Celular(String numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
