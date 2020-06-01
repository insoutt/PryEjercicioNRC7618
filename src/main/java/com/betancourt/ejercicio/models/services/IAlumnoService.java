package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Alumno;

public interface IAlumnoService {

	public void save(Alumno alumno);
	public Alumno findById(Integer id);
	public void delete(Integer id);
	public List<Alumno> findAll();
}
