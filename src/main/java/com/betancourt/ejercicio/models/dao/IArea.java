package com.betancourt.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.betancourt.ejercicio.models.entities.Area;

public interface IArea extends CrudRepository<Area, Integer> {

}
