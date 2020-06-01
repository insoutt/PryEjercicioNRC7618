package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.ISemestre;
import com.betancourt.ejercicio.models.entities.Semestre;

public class SemestreService implements ISemestreService {
	@Autowired
	private ISemestre dao;
	
	@Override
	@Transactional
	public void save(Semestre entity) { dao.save(entity); }

	@Override
	public Semestre findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Semestre> findAll() { return (List<Semestre>) dao.findAll(); }
}
