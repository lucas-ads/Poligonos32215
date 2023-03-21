package formas;

import interfaces.ITrianguloRetangulo;

public class TrianguloRetangulo implements ITrianguloRetangulo{

	private double base;
	private double altura;
	
	@Override
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getBase() {
		return this.base;
	}

	@Override
	public double getAltura() {
		return this.altura;
	}

	@Override
	public double calculaHipotenusa() {
		double h2 = Math.pow(base, 2) + Math.pow(altura, 2);
		
		return Math.sqrt( h2 );
	}

	@Override
	public double calculaArea() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public double calculaPerimetro() {
		return this.base + this.altura + this.calculaHipotenusa();
	}
	
}
