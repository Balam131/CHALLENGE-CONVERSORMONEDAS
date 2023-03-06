
public class Moneda {
	
	double cantidadMoneda;

	public double getCantidadMoneda() {
		return cantidadMoneda;
	}

	public void setCantidadMoneda(double cantidadMoneda) {
		this.cantidadMoneda = cantidadMoneda;
	}
	
	public double conversorMonedaa(double cantidad) {
		double x = 	this.cantidadMoneda * cantidad;
		return x;
	}
	
	public double conversorPesoa(double cantidad) {
		double x =  cantidad/this.cantidadMoneda;
		return x;
	}
	
}
