package entidades;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Matricula implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_estudiante", referencedColumnName = "legajo")
	private Estudiante estudiante;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_carrera", referencedColumnName = "id_carrera")
	private Carrera carrera;

	@Column(nullable = false)
	private Timestamp fecha_inscripcion;

	@Column(nullable = true)
	private Timestamp fecha_graduacion;

	@Column(nullable = false, name = "finalizo")
	private boolean finalizo;

	public Matricula() {
		super();
	}

	

	public Matricula(Estudiante estudiante, Carrera carrera, Timestamp fecha_inscripcion, Timestamp fecha_graduacion,
			boolean finalizo) {
		super();
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.fecha_inscripcion = fecha_inscripcion;
		this.fecha_graduacion = fecha_graduacion;
		this.finalizo = finalizo;
	}

	public Matricula(Estudiante estudiante, Carrera carrera) {
		super();
		this.estudiante = estudiante;
		this.carrera = carrera;
	
	}


	public Timestamp getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(Timestamp fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public Timestamp getFecha_graduacion() {
		return fecha_graduacion;
	}

	public void setFecha_graduacion(Timestamp fecha_graduacion) {
		this.fecha_graduacion = fecha_graduacion;
	}

	public boolean isFinalizo() {
		return finalizo;
	}

	public void setFinalizo(boolean finalizo) {
		this.finalizo = finalizo;
	}



	@Override
	public String toString() {
		return "Matricula [estudiante=" + estudiante + ", carrera=" + carrera + ", fecha_inscripcion="
				+ fecha_inscripcion + ", fecha_graduacion=" + fecha_graduacion + ", finalizo=" + finalizo + "]";
	}



	public Estudiante getEstudiante() {
		return estudiante;
	}



	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}



	public Carrera getCarrera() {
		return carrera;
	}



	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	

}
