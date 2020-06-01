package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Profesor;

public interface IProfesor  extends CrudRepository<Profesor, Integer> {

}
