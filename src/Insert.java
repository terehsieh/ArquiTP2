import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

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
//		Carrera c1 = new Carrera(1, "Tudai");
//		Carrera c2 = new Carrera(2, "Sistemas");
//		Carrera c3 = new Carrera(3, "Tupar");
//		Carrera c4 = new Carrera(4, "Fisica");
//		
//		CarreraController carreras = new CarreraController();
//		carreras.insert(c1);
//		carreras.insert(c2);
//		carreras.insert(c3);
//		carreras.insert(c4);
//// ESTUDIANTES
//		Estudiante e1 = new Estudiante(1, "Tere", "Hsieh", 23, "F", 11, "Tandil");
//		Estudiante e2 = new Estudiante(2, "Nina", "Encinosa", 23, "F", 123, "Tandil");
//		Estudiante e3 = new Estudiante(3, "Fede", "Fuhr", 23, "M", 234, "Tandil");
//		Estudiante e4 = new Estudiante(4, "Martin", "Massimo", 23, "M", 345, "Tandil");
//		Estudiante e5 = new Estudiante(5, "Juan", "Massimo", 23, "M", 111, "Necochea");
//		Estudiante e6 = new Estudiante(6, "Flor", "Sanna", 23, "F", 222, "Loberia");
//		Estudiante e7 = new Estudiante(7, "Pepe", "Sanna", 23, "F", 222, "Azul");
//		
//		EstudianteController estudiantes = new EstudianteController();
//		estudiantes.insert(e1);
//		estudiantes.insert(e2);
//		estudiantes.insert(e3);
//		estudiantes.insert(e4);
//		estudiantes.insert(e5);
//		estudiantes.insert(e6);
//		estudiantes.insert(e7);
//		//MATRICULAS
//		Matricula m1= new Matricula(e1, c1, new Date(2019,12,16), new Date(2020,11,16), true);
//		Matricula m2= new Matricula(e1, c2,new Date(2018,12,16), new Date(2020,11,16), false);
//		Matricula m3= new Matricula(e2, c2,new Date(2018,12,16), new Date(2019,11,16), true);
//		Matricula m4= new Matricula(e4, c4,new Date(2017,12,16), new Date(2022,11,16), false);
//		Matricula m5= new Matricula(e5, c2,new Date(2016,12,16), new Date(2019,11,16), false);
//		Matricula m6= new Matricula(e6, c2,new Date(2016,12,16), new Date(2019,11,16), true);
//		
//		MatriculaController matricula= new MatriculaController();
//		matricula.insert(m1);
//		matricula.insert(m2);
//		matricula.insert(m3);
//		matricula.insert(m4);
//		matricula.insert(m5);
//		matricula.insert(m6);
		cargarCarreras();
		

	}
	public static void cargarCarreras() {
		try {
			CSVParser carrerasCSV = CSVFormat.DEFAULT.withHeader().parse(new FileReader("csv/carreras.csv"));
			CarreraController carreras = new CarreraController();
			carreras.agregarCarreras(carrerasCSV);
			//clientes.agregarClientes(clientesCSV);
			
			CSVParser estudiantesCSV = CSVFormat.DEFAULT.withHeader().parse(new FileReader("csv/estudiantes.csv"));
			EstudianteController estudiantes = new EstudianteController();
			estudiantes.agregarEstudiantes(estudiantesCSV);
//			
//			
//			CSVParser matriculasCSV = CSVFormat.DEFAULT.withHeader().parse(new FileReader("csv/matriculas.csv"));
//	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
