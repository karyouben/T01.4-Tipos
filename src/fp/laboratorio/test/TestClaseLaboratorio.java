package fp.laboratorio.test;

import java.time.LocalDateTime;
import java.time.Month;

import fp.laboratorio.ClaseLaboratorio;
import fp.laboratorio.ClaseLaboratorioImpl;
import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class TestClaseLaboratorio {

	public static void main(String[] args) {
		//EJERCICIO 1
		ClaseLaboratorio clase = new ClaseLaboratorioImpl(6);
		//EJERCIDIO 2
		System.out.println("Numero de estudiantes: " + clase);
		//EJERCICIO 3
		Estudiante e1 = new EstudianteImpl ("Karim", "Youssafi", "karyou");
		Estudiante e2 = new EstudianteImpl ("Miguel", "Garcia", "Miggar");
		Estudiante e3 = new EstudianteImpl ("Daniel", "Mateos", "danmat");
		clase.inscribeEstudiante(e1);
		clase.inscribeEstudiante(e2);
		clase.inscribeEstudiante(e3);
		// Ejercicio 4
		Estudiante e4 = new EstudianteImpl ("Hedy", "Lamarr", "hedlam");
		Estudiante e5 = new EstudianteImpl ("Rita", "Perlman", "ritper");
		Estudiante e6 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		e4.sumarPuntos(22.0);
		e5.sumarPuntos(14.0);
		e6.sumarPuntos(23.0);
		clase.inscribeEstudiante(e4);
		clase.inscribeEstudiante(e5);
		clase.inscribeEstudiante(e6);
		// Ejercicio 5
		//Defina el profesor,aula y horario para el laboratorio.
		clase.setAula("A4.30");
		clase.setProfesor("Jane Doe");
		clase.setFechaHora(LocalDateTime.of(2019, Month.FEBRUARY,22,15,30));
		System.out.println(clase);
		
		Estudiante e7 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		e7.sumarPuntos(23.0);
		System.out.println(e6==e7);
		System.out.println(e6.equals(e7));
		System.out.println(e6.hashCode());
		System.out.println(e7.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e1.compareTo(e7));		
	}

}
