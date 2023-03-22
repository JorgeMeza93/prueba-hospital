package com.pruebahospital.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCita;
	@Column(name = "doctor")
	private String doctor;
	@Column(name="horario")
	private Date horario;
	@Column(name = "paciente")
	private String nombrePaciente;
	
	
}
