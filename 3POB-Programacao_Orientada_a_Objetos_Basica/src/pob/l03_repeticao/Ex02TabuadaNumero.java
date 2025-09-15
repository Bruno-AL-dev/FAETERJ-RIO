/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Estruturas de Repetição em Java
   
    Exercício 2: Tabuada de um número
    Descrição:
    Escreva um programa que solicite um número ao usuário e exiba a
    tabuada desse número de 1 a 10, utilizando um loop while.
    Requisitos:
    • O programa deve pedir um número inteiro ao usuário.
    • Utilizar um contador para iterar de 1 a 10.
    • Exibir a multiplicação do número pelo contador em cada iteração.
*/
package pob.l03_repeticao;

import java.util.Scanner;

public class Ex02TabuadaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        System.out.println("Tabuada de: " + num);

        while (i <= 10) {
            System.out.println(i + " x " + num + 
            " = " + (num * i));
            i++;
        }

        sc.close();
    }
}