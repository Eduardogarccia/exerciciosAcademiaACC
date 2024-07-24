package aula1;

import java.util.Scanner;

public class LocalizaNumero {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Digite o número que deseja procurar: ");
		int numero = input.nextInt();
		
		boolean achou = false;
		int indexEncontrado = 0;
		
		for (int i=0; i<10; i++) {
			if (vetor[i] == numero){
				achou = true;
				indexEncontrado = i;
				break;
		    }
		}
		if (achou) {
	        System.out.println("Achei");
	        System.out.printf("Na Posição %d está localizado do numero %d.", indexEncontrado, vetor[indexEncontrado]);			
		} else {
			System.out.println("Número não está presente no vetor informado.");
		}
		
		input.close();
	}

}
