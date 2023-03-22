package com.pruebahospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDoctor;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Size(min=3, max=50)
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Size(min=3, max=100)
	@Column(name = "apellido_paterno", nullable = false, length = 100)
	private String apellidoPaterno;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Size(min=3, max=100)
	@Column(name = "apellido_materno", nullable = false, length = 100)
	private String apellidoMaterno;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Column(name = "especialidad", nullable = false, length = 50)
	private String especialidad;
	
	public Integer getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
