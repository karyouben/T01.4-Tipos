package fp.tipos.common;

import java.util.LinkedList;
import java.util.List;

import fp.tipos.utiles.Checkers;
import fp.tipos.utiles.Ficheros;
public class FactoriaPuntos {
	
	public static Punto create() {
		return new PuntoImpl();
	}
	public static Punto create(Double x,Double y) {
		return new PuntoImpl(x,y);
	}
	public static Punto create(Double x) {
		return new PuntoImpl(x);
	}
	public static Punto create(String s) {
		return new PuntoImpl(s);
	}
	
	//Create copia
	public static Punto create(Punto p) {
		return new PuntoImpl(p.getX(),p.getY());
	}
	
	public static List<Punto> createPuntos(String nombreFichero) {
		Checkers.checkNoNull(nombreFichero);
		String msg = String.format("Error leyendo fichero %s", nombreFichero);
		List<Punto> res = new LinkedList<Punto>();
		List <String> lineas = Ficheros.leeFichero(msg, nombreFichero);
		for (String linea: lineas) {
			res.add(create(linea));
//			Punto p = create(linea);
//			res.add(p);
		}
		return res;
	}




}