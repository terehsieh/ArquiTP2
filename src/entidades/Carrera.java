package entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {

	@Id
	private int id_carrera;

	@Column(nullable = false)
	private String nombre_carrera;

@OneToMany(mappedBy = "carrera")
	private List<Matricula> estudiantes;

	public Carrera(int id_carrera, String nombre_carrera, List<Matricula> estudiantes) {
		super();
		this.id_carrera = id_carrera;
		this.nombre_carrera = nombre_carrera;
		this.estudiantes = estudiantes;
	}

	public Carrera(int id_carrera, String nombre_carrera) {
		super();
		this.id_carrera = id_carrera;
		this.nombre_carrera = nombre_carrera;

	}

	public Carrera() {
		super();
	}

	public int getId_Carrera() {
		return id_carrera;
	}

	public void setId_Carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public String getNombre_carrera() {
		return nombre_carrera;
	}

	public void setNombre_carrera(String nombre_carrera) {
		this.nombre_carrera = nombre_carrera;
	}

	public List<Matricula> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Matricula> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Carrera [id_carrera=" + id_carrera + ", nombre_carrera=" + nombre_carrera + ", estudiantes="
				+ estudiantes + "]";
	}

}
