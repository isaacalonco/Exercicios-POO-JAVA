package com.mycompany.javaexercicios;

import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salario base do funcionario: R$ ");
        double salarioBase = scanner.nextDouble();
        
        if (salarioBase < 0) {
            System.out.println("Erro: O salario nao pode ser negativo!");
            scanner.close();
            return;
        }
        
        double percentualGratificacao = 5.0;
        double percentualImposto = 7.0;
        
        double valorGratificacao = salarioBase * (percentualGratificacao / 100);
        
        double valorImposto = salarioBase * (percentualImposto / 100);
        
        double salarioAReceber = salarioBase + valorGratificacao - valorImposto;
        
        System.out.println("\n-- Calculo do Salario  --");
        System.out.printf("Salario Base: R$ %.2f\n", salarioBase);
        System.out.printf("Gratificacao (5%%): R$ +%.2f\n", valorGratificacao);
        System.out.printf("Imposto (7%%): R$ -%.2f\n", valorImposto);
        System.out.printf("Salario a Receber: R$ %.2f\n", salarioAReceber);
        
        scanner.close();
    }
}