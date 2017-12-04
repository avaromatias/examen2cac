package paquete;

public class Casa implements Inmueble{

	Zona zona;
	int metrosCuadrados;
	int ambientes;
	double valor;
	
	public Casa(int unosMetros, int unosAmbientes, double unValor, Zona unaZona) {
		metrosCuadrados = unosMetros;
		ambientes = unosAmbientes;
		valor = unValor;
		zona = unaZona;
	}

	@Override
	public double valor() {
		return valor + zona.getPlus();
	}

	@Override
	public Zona zona() {
		return zona;
	}
	
}
