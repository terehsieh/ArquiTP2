import java.util.ArrayList;
import java.util.List;

import controller.CarreraController;
import controller.EstudianteController;
import controller.MatriculaController;
import entidades.Carrera;
import entidades.Estudiante;

public class Select {

	public Select() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		EstudianteController estudiantes = new EstudianteController();
//System.out.println(estudiantes.getEstudianteDNI(123));
		MatriculaController matricula = new MatriculaController();
		CarreraController carreras = new CarreraController();
		// c) recuperar todos los estudiantes, y especificar algún criterio de
		// ordenamiento simple.
//		for (Estudiante estu : estudiantes.getEstudiantesSortDNI()) {
//			System.out.println(estu);
//	}
//		d) recuperar un estudiante, en base a su número de libreta universitaria. 
		// System.out.println(estudiantes.getEstudianteLegajo(3));
		// e) recuperar todos los estudiantes, en base a su género.
		String genero = "Masculino";
		System.out.println("Estudiantes de genero " + genero);
		for (Estudiante estu : estudiantes.getEstudianteGenero(genero)) {
			System.out.println(estu);
		}
		// f) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad
		// de inscriptos.
//		for (Carrera carrera : carreras.getCarrerasPorInscriptos()) {
//		System.out.println(carrera);
//	}		
		// g) recuperar los estudiantes de una determinada carrera, filtrado por ciudad
		// de residencia.
		String carrera = "Sistemas";
		String residencia = "Sandy";
		System.out.println("Estudiante de " + residencia + "que estudia en " + carrera);
		for (Estudiante estudiante : estudiantes.getEstudiantesCarreraResidencia("Sistemas", "Sandy")) {
			System.out.println(estudiante);
		}

	}

}
