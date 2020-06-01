package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Matricula;

public interface IMatricula  extends CrudRepository<Matricula, Integer>{

}
