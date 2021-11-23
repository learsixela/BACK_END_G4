package com.nttdata.models;

public class Cliente {
//atributos
	private String rut;
	private String nombre; 
	private Integer edad; 
	private String sexo;
	private Boolean plan;
	private String celular;
	
	public Cliente() {
		super();
	}
	public Cliente(String rut, String nombre, Integer edad, String sexo, Boolean plan, String celular) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.plan = plan;
		this.celular = celular;
	}
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", plan=" + plan
				+ ", celular=" + celular + "]";
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getPlan() {
		return plan;
	}
	public void setPlan(Boolean plan) {
		this.plan = plan;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	

	

}
