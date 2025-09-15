/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Estruturas de Repetição em Java
   
    Exercício 5: Números primos em um intervalo
    Descrição:
    Escreva um programa que solicite dois números ao usuário e exiba todos os
    números primos no intervalo entre eles, utilizando um loop aninhado (for
    dentro de for).
    Requisitos:
    • O programa deve solicitar dois números inteiros positivos (início e fim
    do intervalo).
    • Deve utilizar um loop externo para percorrer os números dentro do
    intervalo.
    • Deve utilizar um loop interno para verificar se cada número é primo.
    • Exibir apenas os números primos encontrados.
*/
package pob.l03_repeticao;

import java.util.Scanner;

public class Ex05NumerosPrimosIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Números primos no intervalo entre " + 
        num1 + " e " + num2 + ":");

        for (int i = num1; i <= num2; i++) {
            
            int divisores = 0;

            for (int j = 1; j <= num2; j++) {
                if(i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(i);
            }
        }  

        sc.close();
    }
}