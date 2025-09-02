/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 5: Conversão de Idade para Dias
   Desenvolva um programa que leia a idade de uma pessoa em anos
   e exiba a quantidade aproximada de dias que ela já viveu.
   Considere um ano com 365 dias.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex05ConverteIdadeParaDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();     

        System.out.println("Quantidade aproximada de dias " +
        "já vividos: " + idade * 365);

        sc.close();
    }
}