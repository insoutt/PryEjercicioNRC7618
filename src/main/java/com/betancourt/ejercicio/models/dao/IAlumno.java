package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer> {

}
