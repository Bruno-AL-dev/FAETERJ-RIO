/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 3: Conversão de Temperatura
   Crie um programa que leia uma temperatura em graus Celsius e
   a converta para Fahrenheit.
   Fórmula: F = (C × 9/5) + 32.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex03ConverteCelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double tempC = sc.nextDouble();

        double tempF = (tempC * (9.0/5.0)) + 32;     

        System.out.println("Temperatura em Fahrenheit: " + tempF);

        sc.close();
    }
}