package com.pruebahospital.service;

import java.util.List;
import java.util.Optional;

import com.pruebahospital.model.Doctor;

public interface IDoctoresService {
	
	public List<Doctor> findAll();
	public Optional<Doctor> findById(Integer id);
	public Doctor create(Doctor doctor);
	public Doctor update(Doctor doctor);
	public void deleteById(Integer id);
	
}
