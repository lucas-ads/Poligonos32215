package interfaces;

public interface ITrianguloRetangulo {
	void setBase(double base);
	void setAltura(double altura);
	double getBase();
	double getAltura();
	
	double calculaHipotenusa();
	double calculaArea();
	double calculaPerimetro();
}
