/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Estruturas de Repetição em Java
   
    Exercício 1: Soma dos N primeiros números naturais
    Descrição:
    Crie um programa que solicite ao usuário um número N e
    utilize um loop for para calcular a soma dos primeiros N
    números naturais.
    Requisitos:
    • O programa deve utilizar um contador para iterar de 1 até N.
    • Deve utilizar um acumulador para somar os valores sucessivos.
    • Ao final, exibir a soma total.
*/
package pob.l03_repeticao;

import java.util.Scanner;

public class Ex01SomaNumerosNaturais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            soma+= i;
        }

        System.out.println("A soma total de 1 até " + num + 
        " é: " + soma);

        sc.close();
    }
}