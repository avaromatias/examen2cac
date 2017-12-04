package paquete;

public class Main {

	public static void main(String[] args) {
		
		Zona plm = new Zona(10);
		PH ph = new PH(10,20,plm);
		Venta venta = new Venta(ph);
		
		System.out.println(ph.valor());

	}

}
