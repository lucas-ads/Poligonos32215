package formas;

import interfaces.Redimensionavel;

public abstract class Forma implements Redimensionavel{
	private String color;

	public Forma() {
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
