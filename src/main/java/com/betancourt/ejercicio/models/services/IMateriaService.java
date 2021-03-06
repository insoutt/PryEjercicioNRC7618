package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Materia;

public interface IMateriaService {
	public void save(Materia entity);
	public Materia findById(Integer id);
	public void delete(Integer id);
	public List<Materia> findAll();
}
