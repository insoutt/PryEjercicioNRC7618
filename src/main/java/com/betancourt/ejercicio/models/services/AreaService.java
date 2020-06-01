package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.betancourt.ejercicio.models.dao.IArea;
import com.betancourt.ejercicio.models.entities.Area;

public class AreaService implements IAreaService {
	@Autowired
	private IArea dao;
	
	@Override
	@Transactional
	public void save(Area entity) { dao.save(entity); }

	@Override
	public Area findById(Integer id) { return dao.findById(id).get(); }

	@Override
	@Transactional
	public void delete(Integer id) { dao.deleteById(id); }

	@Override
	public List<Area> findAll() { return (List<Area>) dao.findAll(); }
}
