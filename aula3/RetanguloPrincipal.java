package aula3;

import javax.swing.JOptionPane;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		
		Retangulo novoRetangulo = new Retangulo();
		
		
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 1 do retangulo"));
		novoRetangulo.setLado1(lado1);
		
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 2 do retangulo"));
		novoRetangulo.setLado2(lado2);
		
		novoRetangulo.CalcularAreaRetangulo();
		
		novoRetangulo.CalcularPerimetroRetangulo();
		

	}

}
