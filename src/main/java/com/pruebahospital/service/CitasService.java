package com.pruebahospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pruebahospital.model.Cita;
import com.pruebahospital.repository.ICitasRepository;

public class CitasService implements ICitaService {
	
	@Autowired
	private ICitasRepository citasRepositorio;
	
	@Override
	public List<Cita> findAll() {
		return citasRepositorio.findAll();
	}

	@Override
	public Optional<Cita> findById(Integer id) {
		return citasRepositorio.findById(id);
	}

	@Override
	public Cita create(Cita cita) {
		return citasRepositorio.save(cita);
	}

	@Override
	public Cita update(Cita cita) {
		return citasRepositorio.save(cita);
	}

	@Override
	public void deleteById(Integer id) {
		citasRepositorio.deleteById(id);
		
	}

}
