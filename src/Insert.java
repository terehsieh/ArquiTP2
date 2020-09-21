import java.sql.Timestamp;

import controller.CarreraController;
import controller.EstudianteController;
import controller.MatriculaController;
import entidades.Carrera;
import entidades.Estudiante;
import entidades.Matricula;

public class Insert {

	public Insert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// CARRERAS
		Carrera c1 = new Carrera(1, "Tudai");
		Carrera c2 = new Carrera(2, "Sistemas");
		Carrera c3 = new Carrera(3, "Tupar");
		CarreraController carreras = new CarreraController();
		carreras.insert(c1);
		carreras.insert(c2);
		carreras.insert(c3);
// ESTUDIANTES

		Estudiante e1 = new Estudiante(1, "Tere", "Hsieh", 23, "F", 11, "Tandil");
		Estudiante e2 = new Estudiante(2, "Nina", "Encinosa", 23, "F", 123, "Tandil");
		Estudiante e3 = new Estudiante(3, "Fede", "Fuhr", 23, "M", 234, "Tandil");
		Estudiante e4 = new Estudiante(4, "Martin", "Massimo", 23, "M", 345, "Tandil");

		EstudianteController estudiantes = new EstudianteController();
		estudiantes.insert(e1);
		estudiantes.insert(e2);
		estudiantes.insert(e3);
		estudiantes.insert(e4);
		
		Matricula m1= new Matricula(e1, c1,new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), false);
		Matricula m2= new Matricula(e1, c2,new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), false);
		Matricula m3= new Matricula(e2, c2,new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), false);
		
		MatriculaController matricula= new MatriculaController();
		matricula.insert(m1);
		matricula.insert(m2);
		matricula.insert(m3);

	}

}
