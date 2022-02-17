package fp.tipos.common;

public class PuntoImpl implements Punto {

	//Atributos
	private Double x;
	private Double y;
	
	//Constructores
	
	
	/**
	 * Constructor que crea siempre el punto (0,0)
	 */
	public PuntoImpl() {
		x=0.0;
		y=0.0;
	/**
	 * @param x Coordenada x del punto a crear
	 * @param y Coordenada y del punto a crear
	 * constructor para crear objetos
	 */	
	}
	

	public PuntoImpl(Double x, Double y) {
		this.x=x;
		this.y=y;
	/**
	* @param x Coordenada x del punto a crear
	* Constructor para crear puntos x,0.0
    */	
	}
	public PuntoImpl(Double x) {
		this.x=x;
		   y= 0.0;
		
	}
	// Consultores
	public Double getx() {
		return x;	
	}
	public Double gety() {
		return y;
	}
	
	//Modificadores
	
	/**
	 *@Param nuevaX Nueva coordenada X del punto
	 */
	public void setX(Double nuevaX) {
		x= nuevaX;
		
	}
	public void setY(Double nuevaY) {
		Y= nuevaY;
		
	//Resto de operaciones
	}
	public Double getDistancia(Punto p) {
		Double difX= this.getX()- p.getX();
		Double difY= this.getY()- p.getY();
		// return Math.sqrt(difX*difX + difY*difY);
		return Math.sqrt(Math.pow(difX, 2)+ Math.pow(difY, 2));
	}
	
	//representación como cadena del objeto
	public String toString( ) {
		return "(" + this.getX() + "," + this.getY()+ ")";
	}

}
