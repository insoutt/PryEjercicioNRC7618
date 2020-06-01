package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.IAula;
import com.betancourt.ejercicio.models.entities.Aula;

public class AulaService implements IAulaService {

	@Autowired
	private IAula dao;
	
	@Override
	@Transactional
	public void save(Aula entity) { dao.save(entity); }

	@Override
	public Aula findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Aula> findAll() { return (List<Aula>) dao.findAll(); }

}
