package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Semestre;

public interface ISemestreService {
	public void save(Semestre entity);
	public Semestre findById(Integer id);
	public void delete(Integer id);
	public List<Semestre> findAll();
}