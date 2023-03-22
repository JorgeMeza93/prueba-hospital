package com.pruebahospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebahospital.model.Doctor;

public interface IDoctoresRepository extends JpaRepository<Doctor, Integer>{

}
