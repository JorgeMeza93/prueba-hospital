package com.pruebahospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebahospital.model.Cita;

public interface ICitasRepository extends JpaRepository<Cita, Integer>{

}
