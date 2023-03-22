package com.pruebahospital.service;

import java.util.List;
import java.util.Optional;

import com.pruebahospital.model.Cita;

public interface ICitaService {
	
	public List<Cita> findAll();
	public Optional<Cita> findById(Integer id);
	public Cita create(Cita cita);
	public Cita update(Cita cita);
	public void deleteById(Integer id);

}
