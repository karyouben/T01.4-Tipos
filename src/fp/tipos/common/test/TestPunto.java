package fp.tipos.common.test;

import fp.tipos.common.Punto;
import fp.tipos.common.PuntoImpl;

public class TestPunto {
	public static void main (String[] args) {
		Punto p = new PuntoImpl();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		Punto p1 = new PuntoImpl(2.5,1.5);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		Double d = p.getDistancia(p1);
		System.out.println("Distancia " + d);
	}

}
