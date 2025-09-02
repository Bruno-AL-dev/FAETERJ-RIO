/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 1: Soma de Dois Números
   Escreva um programa que solicite ao usuário dois números
   inteiros e exiba a soma deles.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex01SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo numero inteiro: ");
        int num2 = sc.nextInt();        

        System.out.println("Soma igual a: " + (num1 + num2));

        sc.close();
    }
}