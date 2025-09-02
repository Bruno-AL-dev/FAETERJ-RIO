/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 4: Cálculo de Média Simples
   Faça um programa que solicite ao usuário três notas (valores
   decimais) e exiba a média aritmética delas.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex04CalculaMediaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota3 = sc.nextFloat();         

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

        sc.close();
    }
}