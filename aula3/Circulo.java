package aula3;

import javax.swing.JOptionPane;

public class Circulo {

	private double raio;
	private double area;
	private double perimetro;
	
	public Circulo() {

	}

	public Circulo(double raio, double area, double perimetro) {
		super();
		this.raio = raio;
		this.area = area;
		this.perimetro = perimetro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void CalcularAreaCirculo() {
		double area = Math.pow(raio,  2) * 3.14; 
		JOptionPane.showMessageDialog(null, "Área de " + area);
	}
	
	public void CalcularPerimetroCirculo() {
		double perimetro = raio * 2 * 3.14; 
		JOptionPane.showMessageDialog(null, "Perímetro de " + perimetro);
	}
	
	
}
