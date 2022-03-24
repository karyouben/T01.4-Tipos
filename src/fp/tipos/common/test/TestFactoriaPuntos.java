package fp.tipos.common.test;

import java.util.List;

import fp.tipos.common.FactoriaPuntos;
import fp.tipos.common.Punto;

public class TestFactoriaPuntos {

	public static void main(String[] args) {
		List<Punto> puntos = FactoriaPuntos.createPuntos("./data/puntos.txt");
		System.out.println(String.format("Se ha leido %d puntos", puntos.size()));
		for (Punto p: puntos) {
			System.out.println("Punto :" + p);
		}

	}

}
