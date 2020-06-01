package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Materia;

public interface IMateria extends CrudRepository<Materia, Integer> {

}
