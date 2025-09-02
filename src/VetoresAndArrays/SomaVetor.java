package VetoresAndArrays;

import java.util.Scanner;

/*
*   Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
*   - Imprimir todos os elementos do vetor
*   - Mostrar na tela a soma e a média dos elementos do veto
*/

public class SomaVetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for  (int i = 0; i < numbers.length; i++) {
            System.out.print("\nDigite um numero: ");
            numbers[i] = sc.nextDouble();
            soma += numbers[i];
        }

        media = soma / n;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\n%,.2f ", numbers[i]);
        }

        System.out.printf("\n\nSoma numeros: %,.2f\n", soma);
        System.out.printf("Media numeros: %,.2f", media);

    }
}
