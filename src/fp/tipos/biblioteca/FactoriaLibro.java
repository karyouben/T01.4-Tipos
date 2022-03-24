package fp.tipos.biblioteca;

import java.util.ArrayList;
import java.util.List;

import fp.tipos.utiles.Checkers;
import fp.tipos.utiles.Ficheros;

public class FactoriaLibro {
	
	
	public static List<Libro> creaLibros(String fichero){
		Checkers.checkNoNull(fichero);
		List<String> lineas = Ficheros.leeFichero(fichero, fichero);
		
		List<Libro> res = new ArrayList<Libro>();
//		Boolean esPrimera = true;
		lineas.remove(0);
		for(String linea:lineas) {
//			if(!esPrimera) {
				Libro l = new Libro(linea);
				res.add(l);
//			}else {
//				esPrimera = false;
			}return res;
		}
	}


