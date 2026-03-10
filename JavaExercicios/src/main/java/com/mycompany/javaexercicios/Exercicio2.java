package com.mycompany.javaexercicios;

import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
         System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3.0;
        
        System.out.println("\n-- Resultado --");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.printf("Media Aritmetica : %.2f\n", media);
        
        scanner.close();
    }
}