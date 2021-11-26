package com.nttdata.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String descripcion;
	private Double precio;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	//relacion many to many
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="categorias_productos",//tabla intermedia
		joinColumns = @JoinColumn(name="producto_id"),
		inverseJoinColumns = @JoinColumn(name="categoria_id")
	)
	private List<Categoria> categorias;

	public Producto() {
		super();
	}

	public Producto(Long id, String nombre, String descripcion, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
}
