package componentes;

import formas.Quadrado;
import interfaces.Redimensionavel;

public class CaixaDeTexto implements Redimensionavel{
	private String texto;
	private double tamanhoDaFonte;
	
	public CaixaDeTexto(String texto, double fontSize) {
		this.texto = texto;
		this.tamanhoDaFonte = fontSize;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void redimensiona(double coeficiente) {
		this.tamanhoDaFonte = this.tamanhoDaFonte * coeficiente;
	}
}
