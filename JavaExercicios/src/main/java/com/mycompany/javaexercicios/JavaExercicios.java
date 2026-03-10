package com.mycompany.javaexercicios;

import java.util.Scanner;

public class JavaExercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Soma de 4 numeros");
        System.out.println("2. Media de 3 notas");
        System.out.println("3. Media ponderada de 3 notas");
        System.out.println("4. Aumento de 25% no salario");
        System.out.println("5. Aumento de salario com percentual");
        System.out.println("6. gratificacao e imposto");
        System.out.print("\nEscolha uma opcao (1 a 6): ");
        
        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("\n--- Exercicio 1: Soma de Numeros ---\n");
                SomaNumeros.main(args);
                break;
            case 2:
                System.out.println("\n--- Exercicio 2: Media de Notas ---\n");
                MediaNotas.main(args);
                break;
            case 3:
                System.out.println("\n--- Exercicio 3: Media Ponderada ---\n");
                MediaPonderada.main(args);
                break;
            case 4:
                System.out.println("\n--- Exercicio 4: Aumento de Salario ---\n");
                AumentoSalario.main(args);
                break;
            case 5:
                System.out.println("\n--- Exercicio 5: Aumento de Salario (Percentual Variável) ---\n");
                AumentoSalarioPercentual.main(args);
                break;
            case 6:
                System.out.println("\n--- Exercicio 6: Salario com Gratificacao e Imposto ---\n");
                SalarioComGratificacao.main(args);
                break;
            default:
                System.out.println("Opcao invalida!");
        }
        
        scanner.close();
    }
}