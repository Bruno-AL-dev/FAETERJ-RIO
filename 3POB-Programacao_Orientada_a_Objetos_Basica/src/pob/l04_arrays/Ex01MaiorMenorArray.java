/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Manipulação de Arrays em Java
   
    Exercício 1: Maior e Menor Valor em um Array
    Descrição:
    Crie um programa que solicite ao usuário 5 números inteiros
    e armazene-os em um array. Após isso, o programa deve exibir
    o maior e o menor número do array.
    Requisitos:
    • Criar um array de tamanho 5.
    • Utilizar um loop for para percorrer o array e encontrar o
    maior e o menor valor.
    • Exibir o maior e o menor número armazenados no array.
*/
package pob.l04_arrays;

import java.util.Scanner;

public class Ex01MaiorMenorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i+1) + "º valor: ");
            array[i]= sc.nextInt();
        }

        int maior = array[0], menor = array[0];

        for (int i = 1; i < 5; i++) {
            if (maior < array[i]) {
                maior = array[i];
            } else if (menor > array[i]) {
                menor = array[i];
            }
        }

        System.out.println("Maior número armazenado no array: " + maior);
        System.out.println("Menor número armazenado no array: " + menor);

        sc.close();
    }
}