package paquete;

public class PH implements Inmueble {

	Zona zona;
	int metrosCuadrados;
	int ambientes;
	
	public PH(int unosMetros, int unosAmbientes, Zona unaZona) {
		metrosCuadrados = unosMetros;
		ambientes = unosAmbientes;
		zona = unaZona;
	}

	@Override
	public double valor() {
		return Math.max(500000, 14000 * metrosCuadrados) + zona.getPlus();
	}

	@Override
	public Zona zona() {
		return zona;
	}
	
}
