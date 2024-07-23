package aula1;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valorClasseA = 50;
        int valorClasseB = 30;
        int valorClasseC = 20;

        int valorTotalBilhetesA = lerNumero("Digite a quantidade de bilhetes classe A vendidos: ", input) * valorClasseA;
        int valorTotalBilhetesB = lerNumero("Digite a quantidade de bilhetes classe B vendidos: ", input) * valorClasseB;
        int valorTotalBilhetesC = lerNumero("Digite a quantidade de bilhetes classe C vendidos: ", input) * valorClasseC;
        
        int rendaTotal = (valorTotalBilhetesA + valorTotalBilhetesB + valorTotalBilhetesC);

        System.out.printf("Renda total gerada: R$%d,00", rendaTotal);

        input.close();
    }

    private static int lerNumero(String mensagem, Scanner input) {
        System.out.print(mensagem);
        return input.nextInt();
    }
}
