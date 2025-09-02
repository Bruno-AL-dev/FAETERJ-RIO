/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 7: Cálculo do Perímetro e Área de um Retângulo
   Faça um programa que solicite a base e a altura de um
   retângulo e exiba o seu perímetro e sua área.
   Fórmulas:
   Área = base × altura
   Perímetro = 2 × (base + altura).
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex07CalculaAreaPerimetroRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base do retângulo: ");
        float base = sc.nextFloat();

        System.out.print("Informe a altura do retângulo: ");
        float altura = sc.nextFloat();

        float area = base * altura;

        float perimetro = 2 * (base + altura);    

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: "+ perimetro);

        sc.close();
    }
}