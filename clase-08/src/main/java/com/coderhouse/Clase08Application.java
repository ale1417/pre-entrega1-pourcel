package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner{
	
	@Autowired // 
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			Curso curso1 = new Curso("Java");
			Curso curso2 = new Curso("Ingles");
			Curso curso3 = new Curso("React");
			Curso curso4 = new Curso("Python");
			Curso curso5 = new Curso("Css");
			
			Alumno alumno1 = new Alumno("Pedro", "Sanchez", 44123879, "L44123879", 49);
			Alumno alumno2 = new Alumno("Rodrigo", "Perez", 44980712, "L44980712", 49);
			Alumno alumno3 = new Alumno("Federico", "Barboza", 50890712, "50890712", 49);
			Alumno alumno4 = new Alumno("Jorge", "Pourcel", 20650781, "L20650781", 49);
			Alumno alumno5 = new Alumno("Gabriel", "Hernandez", 22820780, "L22820780", 49);
			
			dao.persistirAlumno(alumno1);
			dao.persistirAlumno(alumno2);
			dao.persistirAlumno(alumno3);
			dao.persistirAlumno(alumno4);
			dao.persistirAlumno(alumno5);
			
			dao.persistirCurso(curso1);
			dao.persistirCurso(curso2);
			dao.persistirCurso(curso3);
			dao.persistirCurso(curso4);
			dao.persistirCurso(curso5);
			
		} catch(Exception err) {
			err.getMessage();
		}
		
	}


}