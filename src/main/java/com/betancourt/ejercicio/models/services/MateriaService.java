package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.IMateria;
import com.betancourt.ejercicio.models.entities.Materia;

public class MateriaService implements IMateriaService{
	@Autowired
	private IMateria dao;
	
	@Override
	@Transactional
	public void save(Materia entity) { dao.save(entity); }

	@Override
	public Materia findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Materia> findAll() { return (List<Materia>) dao.findAll(); }
}
