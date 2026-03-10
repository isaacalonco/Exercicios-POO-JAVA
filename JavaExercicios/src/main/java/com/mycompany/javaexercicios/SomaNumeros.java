package com.mycompany.javaexercicios;

import java.util.Scanner;

class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        
        System.out.print("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        
        int soma = numero1 + numero2 + numero3 + numero4;
        
        System.out.println("\nA soma dos numeros eh: " + soma);
        
        scanner.close();
    }
}