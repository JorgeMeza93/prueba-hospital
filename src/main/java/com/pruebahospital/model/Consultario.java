package com.pruebahospital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "consultorio")
public class Consultario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsultorio;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Column(name = "consultorio", nullable = false, length = 2)
	private String numeroConsultorio;
	@NotNull(message = "campo obligatorio")
	@NotBlank(message = "campo obligatorio")
	@Column(name = "piso", nullable = false, length = 1)
	private String piso;
	
	public Integer getIdConsultorio() {
		return idConsultorio;
	}
	public void setIdConsultorio(Integer idConsultorio) {
		this.idConsultorio = idConsultorio;
	}
	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}
	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	
	
}
