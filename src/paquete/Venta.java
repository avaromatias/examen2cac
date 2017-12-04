package paquete;

public class Venta implements Operacion {

	Inmueble inmueble;
	double porcentaje = 1.5;
	
	public Venta(Inmueble unInmueble) {
		inmueble = unInmueble;
	}
	
	public double comision() {
		return inmueble.valor() * porcentaje / 100;
	}
	
}
