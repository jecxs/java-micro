package com.practica1.pract.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name= "Cliente")
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String dni;
	private String nombre;
	
	@Column(name = "apellido_paterno")
	private String apellidoP;
	
	@Column(name = "apellido_materno")
	private String apellidoM;
	private String cel;
	private String direccion;
	private String edad;
	public Cliente() {	
		super();
	}
	public Cliente(Long id, String dni, String nombre, String apellidoP, String apellidoM, String cel,
			String direccion, String edad) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.cel = cel;
		this.direccion = direccion;
		this.edad = edad;
	}
	public Long getCod_cliente() {
		return id;
	}
	public void setCod_cliente(Long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	

}
