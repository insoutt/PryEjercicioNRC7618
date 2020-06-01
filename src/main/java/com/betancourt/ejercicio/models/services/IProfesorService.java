package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Profesor;

public interface IProfesorService {
	public void save(Profesor entity);
	public Profesor findById(Integer id);
	public void delete(Integer id);
	public List<Profesor> findAll();
}
