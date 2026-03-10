package com.mycompany.javaexercicios;

import java.util.Scanner;

class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salario atual do funcionario: R$ ");
        double salarioAtual = scanner.nextDouble();
        
        if (salarioAtual < 0) {
            System.out.println("Erro: O salario nao pode ser negativo!");
            scanner.close();
            return;
        }
        
        double percentualAumento = 25.0;
        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;
        
        System.out.println("\n-- Resultado --");
        System.out.printf("Valor do Aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo Salario: R$ %.2f\n", novoSalario);
        
        scanner.close();
    }
}