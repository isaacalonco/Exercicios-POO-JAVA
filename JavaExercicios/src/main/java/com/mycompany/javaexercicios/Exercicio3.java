package com.mycompany.javaexercicios;

import java.util.Scanner;

class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();
        
        System.out.print("\nDigite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();
        
        System.out.print("\nDigite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();
        
        double somaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaPonderada / somaPesos;
        
        System.out.println("\n-- Resultado --");
        System.out.println("Nota 1: " + nota1 + " (Peso: " + peso1 + ")");
        System.out.println("Nota 2: " + nota2 + " (Peso: " + peso2 + ")");
        System.out.println("Nota 3: " + nota3 + " (Peso: " + peso3 + ")");
        System.out.println("Soma dos pesos: " + somaPesos);
        System.out.printf("Media Ponderada: %.2f\n", mediaPonderada);
        
        scanner.close();
    }
}