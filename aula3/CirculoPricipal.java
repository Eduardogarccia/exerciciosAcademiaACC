package aula3;

import javax.swing.JOptionPane;

public class CirculoPricipal {

	public static void main(String[] args) {

		Circulo novoCirculo = new Circulo();
		
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio do círculo"));
		novoCirculo.setRaio(raio);

		novoCirculo.CalcularAreaCirculo();
		
		novoCirculo.CalcularPerimetroCirculo();
		
	}

}
