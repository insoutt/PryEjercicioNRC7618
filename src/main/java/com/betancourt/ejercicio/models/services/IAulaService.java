package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Aula;

public interface IAulaService {
	public void save(Aula entity);
	public Aula findById(Integer id);
	public void delete(Integer id);
	public List<Aula> findAll();
}
