package com.betancourt.ejercicio.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="matriculas")
public class Matricula implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_materia")
	private Integer idMateria;
	
	public Alumno getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Alumno estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getCurso() {
		return curso;
	}

	public void setCurso(Materia curso) {
		this.curso = curso;
	}

	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="costo")
	private float costo;
	
	@Column(name="tipo")
	private String tipo;
	
	@JoinColumn(name = "fk_estudiante", referencedColumnName = "pk_persona")
	@ManyToOne
	private Alumno estudiante;
	
	@JoinColumn(name = "fk_curso", referencedColumnName = "pk_materia")
	@ManyToOne
	private Materia curso;

	public Matricula() {
		super();
	}
	
	public Matricula(Integer id) {
		super();
		this.idMateria = id;
	}
	

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
