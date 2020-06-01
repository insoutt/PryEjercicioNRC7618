package com.betancourt.ejercicio.models.services;

import java.util.List;

import com.betancourt.ejercicio.models.entities.Area;

public interface IAreaService {
	public void save(Area entity);
	public Area findById(Integer id);
	public void delete(Integer id);
	public List<Area> findAll();
}
