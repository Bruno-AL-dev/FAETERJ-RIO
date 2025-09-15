/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Manipulação de Arrays em Java
   
    Exercício 4: Contagem de Números Pares em um Array
    Descrição:
    Crie um programa que solicite ao usuário 8 números
    inteiros e armazene-os em um array. O programa deve
    contar e exibir a quantidade de números pares no array.
    Requisitos:
    • Criar um array de tamanho 8.
    • Utilizar um loop for para percorrer o array e contar
    quantos números são pares.
    • Exibir a quantidade de números pares encontrados.
*/
package pob.l04_arrays;

import java.util.Scanner;

public class Ex04ContagemParesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            array[i]= sc.nextInt();
        }

        int pares = 0;

        for (int i = 0; i < 8; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.print("Quantidade de números pares: " + pares);

        sc.close();
    }
}