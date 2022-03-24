package fp.tipos.biblioteca.test;

import java.util.List;

import fp.tipos.biblioteca.Libro;
import fp.tipos.biblioteca.FactoriaLibro;



public class TestFactoriaLibro {
	public static void main(String[] args) {
		List<Libro> Libros = FactoriaLibro.creaLibros("./data/libros.txt");
		System.out.println(String.format("Se ha leido %d libros", Libros.size()));
		for (Libro l: Libros) {
			System.out.println("Libro :" + l);
		}

	}

}
