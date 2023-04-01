package views;


import java.util.ArrayList;
import java.util.List;

import componentes.CaixaDeTexto;
import formas.Circulo;
import formas.Forma;
import formas.FormaBidimensional;
import formas.Quadrado;
import formas.TrianguloRetangulo;
import interfaces.ITrianguloRetangulo;
import interfaces.Redimensionavel;

public class Programa {

	public static void main(String[] args) {
		ITrianguloRetangulo triangulo = new TrianguloRetangulo();
		triangulo.setBase(9);
		triangulo.setAltura(7);
		System.out.println("A hipotenusa é: " + triangulo.calculaHipotenusa());
		System.out.println("A area é: " + triangulo.calculaArea());
		System.out.println("O perimetro é: " + triangulo.calculaPerimetro());
		System.out.println("A base é " + triangulo.getBase() + " A altura é: " + triangulo.getAltura());
		
		CaixaDeTexto caixa  = new CaixaDeTexto("Hello World", 12);
		Quadrado q1 = new Quadrado(15);
		
		List<Redimensionavel> lista = new ArrayList<Redimensionavel>();
		lista.add(q1);
		lista.add(caixa);
		
		
		
		/*List<FormaBidimensional> poligonos = new ArrayList<FormaBidimensional>();
		
		Quadrado quad1 = new Quadrado(5);
		Quadrado quad2 = new Quadrado(7);
		Quadrado quad3 = new Quadrado(10);
		
		Circulo circ1 = new Circulo(5);
		Circulo circ2 = new Circulo(7);
		Circulo circ3 = new Circulo(10);
		
		poligonos.add(quad1);
		poligonos.add(quad2);
		poligonos.add(quad3);
		
		poligonos.add(circ1);
		poligonos.add(circ2);
		poligonos.add(circ3);
		
		for(FormaBidimensional fb : poligonos){
			System.out.println( fb.toString() );
		}*/
		
	}

}








