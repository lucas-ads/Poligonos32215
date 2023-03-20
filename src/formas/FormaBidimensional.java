package formas;

public abstract class FormaBidimensional extends Forma{
	
	private String corDaBorda;
	private double espessuraDaBorda;
	
	public FormaBidimensional(String cor, String corBorda, double espBorda) {
		this.corDaBorda = corBorda;
		this.espessuraDaBorda = espBorda;
		
		this.setColor(cor);
	}
	
	public FormaBidimensional() {
		this.corDaBorda = "Preto";
		this.espessuraDaBorda = 1;
		
		this.setColor("Azul");
	}
	
	public String getCorDaBorda() {
		return corDaBorda;
	}
	
	public void setCorDaBorda(String corDaBorda) {
		this.corDaBorda = corDaBorda;
	}
	
	public double getEspessuraDaBorda() {
		return espessuraDaBorda;
	}
	
	public void setEspessuraDaBorda(double espessuraDaBorda) {
		this.espessuraDaBorda = espessuraDaBorda;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	@Override
	public String toString() {
		return String.format("-Forma Bidimensional:\nCor: %s\nCor da borda: %s\nEspessura da borda: %f\n", this.getColor(), this.corDaBorda, this.espessuraDaBorda);
	}
	
	
}
