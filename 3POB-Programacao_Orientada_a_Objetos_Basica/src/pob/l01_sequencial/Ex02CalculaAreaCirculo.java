/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 2: Área de um Círculo
   Desenvolva um programa que leia o raio de um círculo e
   calcule sua área.
   Fórmula: Área = π * raio²
   Considere π = 3.14159.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex02CalculaAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio do circulo: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("A area do circulo é: " + area);

        sc.close();
    }
}