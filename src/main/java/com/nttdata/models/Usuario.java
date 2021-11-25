package com.nttdata.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity//representacion de la entidad modelo
@Table(name="usuarios")//nombre de la tabla en la bbdd
public class Usuario {

	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	
	private String nombre;
	private String apellido;
	private String limite;
	private String codigoPostal;
	//relacion 1 a 1
	@OneToOne(mappedBy ="usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Celular celular;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String apellido, String limite, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.limite = limite;
		this.codigoPostal = codigoPostal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLimite() {
		return limite;
	}
	public void setLimite(String limite) {
		this.limite = limite;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	
	
}
