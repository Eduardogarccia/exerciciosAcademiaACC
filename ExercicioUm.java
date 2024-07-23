package aula1;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valorClasseA = 50;
        int valorClasseB = 30;
        int valorClasseC = 20;

        int valorTotalBilhetesA = lerNumero("A", input) * valorClasseA;
        int valorTotalBilhetesB = lerNumero("B", input) * valorClasseB;
        int valorTotalBilhetesC = lerNumero("C", input) * valorClasseC;
        
        int rendaTotal = (valorTotalBilhetesA + valorTotalBilhetesB + valorTotalBilhetesC);

        System.out.printf("Renda total gerada: R$%d,00", rendaTotal);

        input.close();
    }

    private static int lerNumero(String classeBilhete, Scanner input) {
        System.out.printf("Digite a quantidade de bilhetes classe %s vendidos: ", classeBilhete);
        return input.nextInt();
    }
}
