package paquete;

public class Alquiler implements Operacion{

	Inmueble inmueble;
	int cantidadMeses;
	
	public Alquiler(Inmueble unInmueble, int unosMeses) {
		inmueble = unInmueble;
		cantidadMeses = unosMeses;
	}

	public double comision() {
		return cantidadMeses * inmueble.valor() / 50000;
	}
	
}
