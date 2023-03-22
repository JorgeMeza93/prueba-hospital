package com.pruebahospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebahospital.model.Doctor;
import com.pruebahospital.repository.IDoctoresRepository;

@Service
public class DoctorService implements IDoctoresService{
	
	@Autowired
	private IDoctoresRepository doctorRepositorio;
	
	@Override
	public List<Doctor> findAll() {
		return doctorRepositorio.findAll(); 
	}

	@Override
	public Optional<Doctor> findById(Integer id) {
		return doctorRepositorio.findById(id);
	}

	@Override
	public Doctor create(Doctor doctor) {
		return doctorRepositorio.save(doctor);
	}

	@Override
	public Doctor update(Doctor doctor) {
		return doctorRepositorio.save(doctor);
	}

	@Override
	public void deleteById(Integer id) {
		doctorRepositorio.deleteById(id);
		
	}

}
