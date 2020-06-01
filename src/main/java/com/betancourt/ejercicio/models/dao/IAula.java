package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Aula;

public interface IAula  extends CrudRepository<Aula, Integer> {

}
