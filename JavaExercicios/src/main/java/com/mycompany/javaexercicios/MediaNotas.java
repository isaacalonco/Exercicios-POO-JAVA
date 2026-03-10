package com.mycompany.javaexercicios;

import java.util.Scanner;

class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\n-- Resultado --");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.printf("Media: %.2f\n", media);
        
        if (media >= 7.0) {
            System.out.println("Situacao: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situacao: RECUPERACAO");
        } else {
            System.out.println("Situacao: REPROVADO");
        }
        
        scanner.close();
    }
}