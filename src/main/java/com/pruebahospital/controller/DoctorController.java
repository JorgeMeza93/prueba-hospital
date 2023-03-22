package com.pruebahospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebahospital.model.Doctor;
import com.pruebahospital.service.IDoctoresService;

@RestController
@RequestMapping("/api/doctores")
public class DoctorController {
	
	@Autowired
	private IDoctoresService doctoresService;
	
	@GetMapping
	public ResponseEntity<List<Doctor>> obtenerDoctores(){
		return ResponseEntity.ok(doctoresService.findAll());
	} 
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> obtenerDoctorId(@PathVariable("id") Integer id){
		return doctoresService.findById(id)
				.map(ResponseEntity::ok)
				.orElseGet( () -> ResponseEntity.notFound().build());
	}
	@PostMapping("/nuevo")
	public ResponseEntity<Doctor> crearDoctor(@RequestBody Doctor doctor){
		return new ResponseEntity<>(doctoresService.create(doctor), HttpStatus.OK);
		
	}
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Doctor> eliminarDoctor(@PathVariable("id") Integer id){
		return doctoresService.findById(id)
				.map( doc -> {
					doctoresService.deleteById(id);
					return ResponseEntity.ok(doc);
				})
				.orElseGet( () -> ResponseEntity.notFound().build());
	}
	
	
}
