/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Manipulação de Arrays em Java
   
    Exercício 3: Inversão de Elementos de um Array
    Descrição:
    Escreva um programa que solicite ao usuário 6 números
    inteiros e os armazene em um array. Em seguida, exiba
    os números na ordem inversa à de entrada.
    Requisitos:
    • Criar um array de tamanho 6.
    • Utilizar um loop for para preencher o array.
    • Utilizar outro loop for para exibir os elementos na
    ordem inversa.
*/
package pob.l04_arrays;

import java.util.Scanner;

public class Ex03ExibeArrayInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            array[i]= sc.nextInt();
        }

        System.out.print("Valores invertidos: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}