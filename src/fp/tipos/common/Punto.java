package fp.tipos.common;

public interface Punto {
	//Consultores
	Double getx();
	Double gety();
	//Modificadores
	Void setX(Double nuevaX);
	Void setY(Double nuevaY);
	//Otras operaciones
	Double getDistancia(Punto p);

}
