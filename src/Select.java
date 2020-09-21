import java.util.ArrayList;
import java.util.List;

import controller.EstudianteController;
import controller.MatriculaController;
import entidades.Estudiante;

public class Select {

	public Select() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		EstudianteController estudiantes = new EstudianteController();
//System.out.println(estudiantes.getEstudianteDNI(123));
		MatriculaController matricula = new MatriculaController();
		
		//c) recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple.
//		for (Estudiante estu : estudiantes.getEstudiantesSortDNI()) {
//			System.out.println(estu);
//	}
//		d) recuperar un estudiante, en base a su número de libreta universitaria. 
		// System.out.println(estudiantes.getEstudianteLegajo(3));
		// e) recuperar todos los estudiantes, en base a su género.
		for (Estudiante estu : estudiantes.getEstudianteGenero("M")) {
			System.out.println(estu);
		}
	}

}
