package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.IProfesor;
import com.betancourt.ejercicio.models.entities.Profesor;

public class ProfesorService implements IProfesorService {
	@Autowired
	private IProfesor dao;
	
	@Override
	@Transactional
	public void save(Profesor entity) { dao.save(entity); }

	@Override
	public Profesor findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Profesor> findAll() { return (List<Profesor>) dao.findAll(); }
}
