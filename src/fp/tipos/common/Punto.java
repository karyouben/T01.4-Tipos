package fp.tipos.common;

public interface Punto {
	//Consultores
	Double getX();
	Double getY();
	//Modificadores
	void setX(Double nuevaX);
	void setY(Double nuevaY);
	//Otras operaciones
	Double getDistancia(Punto p);

}
