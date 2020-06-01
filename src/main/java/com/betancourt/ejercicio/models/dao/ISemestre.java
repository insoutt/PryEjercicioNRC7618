package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Semestre;

public interface ISemestre extends CrudRepository<Semestre, Integer> {

}
