package fp.laboratorio;

/**
 * Clase que implementa la intefaz Estudiante
 * 
 * @author Toñi Reina
 * @version 1.0.0 22/01/2019
 */
public class EstudianteImpl implements Estudiante {

	private String nombre;
	private String apellidos;
	private String uvus;
	private Double puntos;
	
	/**
	 * @param nombre Nombre del estudiante.
	 * @param apellidos Apellidos del estudiante.
	 * @param uvus UVUS del estudiante.
	 * Crea un estudiante con un nombre, unos apellidos y un uvus. El estudiante tendrá 0 puntos.
	 */
	public EstudianteImpl(String nombre, String apellidos, String uvus) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.uvus = uvus;
		this.puntos = 0.0;
	}
	
	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#getNombre()
	 */
	public String getNombre() {
		return nombre;
	}
	
	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#setNombre(java.lang.String)
	 */
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#getApellidos()
	 */
	public String getApellidos() {
		return apellidos;
	}

	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#setApellidos(java.lang.String)
	 */
	public void setApellidos(String nuevosApellidos) {
		this.apellidos = nuevosApellidos;
	}

	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#getUVUS()
	 */
	public String getUVUS() {
		return uvus;
	}
	
	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#getIniciales()
	 */
	public String getIniciales() {
		return getNombre().trim().charAt(0)+"." +getApellidos().trim().charAt(0)+".";
	}

	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#getPuntos()
	 */
	public Double getPuntos() {
		return puntos;
	}

	/* (non-Javadoc)
	 * @see fp.laboratorio.Estudiante#sumarPuntos(java.lang.Double)
	 */
	public void sumarPuntos(Double puntosAdicionales) {
		this.puntos += puntosAdicionales;
	}
	
	public boolean equals(Object o) {
		boolean res = false;
		// e1.equals("Hola")
		// e6.equals(e7)		
		if (o instanceof Estudiante) {
			Estudiante e = (Estudiante) o;
			res = getUVUS().equals(e.getUVUS()) && 
					getApellidos().equals(e.getApellidos()) &&
					  getNombre().equals(e.getNombre());				}
		return res;
	}
	
	
	public int hashCode() {
		return getUVUS().hashCode() + 31*getApellidos().hashCode() 
				+ 31*31*getNombre().hashCode();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getApellidos()+"," + getNombre()+" - " + getUVUS()+ "- Puntos:" + getPuntos();
	}
	
	public int compareTo(Estudiante e) {
		int res = getApellidos().compareTo(e.getApellidos()); // inverso -> e.getApellidos().compareTo(getApellidos())
		if (res == 0) {
			res = getNombre().compareTo(e.getNombre());
			if (res==0) {
				res = getUVUS().compareTo(e.getUVUS());
			}
				
		}
		return res;
	}
}
