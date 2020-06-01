package com.betancourt.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betancourt.ejercicio.models.dao.IAlumno;
import com.betancourt.ejercicio.models.entities.Alumno;

@Service
public class AlumnoService implements IAlumnoService {

	@Autowired // Inyección de dependencia
	private IAlumno dao;
	
	@Override
	@Transactional
	public void save(Alumno alumno) {
		dao.save(alumno);
	}

	@Override
	public Alumno findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Alumno> findAll() {
		return (List<Alumno>) dao.findAll();
	}

}
