package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.IMatricula;
import com.betancourt.ejercicio.models.entities.Matricula;

public class MatriculaService implements IMatriculaService {
	@Autowired
	private IMatricula dao;
	
	@Override
	@Transactional
	public void save(Matricula entity) { dao.save(entity); }

	@Override
	public Matricula findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Matricula> findAll() { return (List<Matricula>) dao.findAll(); }
}
