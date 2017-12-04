package paquete;

public class Departamento implements Inmueble {

	Zona zona;
	int metrosCuadrados;
	int ambientes;
	
	public Departamento(int unosMetros, int unosAmbientes, Zona unaZona) {
		metrosCuadrados = unosMetros;
		ambientes = unosAmbientes;
		zona = unaZona;
	}

	@Override
	public double valor() {
		return (350000 * ambientes) + zona.getPlus();
	}

	@Override
	public Zona zona() {
		return zona;
	}
	
}
