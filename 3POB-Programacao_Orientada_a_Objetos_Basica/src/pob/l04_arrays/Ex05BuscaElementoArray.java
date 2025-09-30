/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 10/09/2025
   
    Lista de Exercícios
    Manipulação de Arrays em Java
   
    Exercício 5: Busca de Elemento em um Array
    Descrição:
    Implemente um programa que solicite ao usuário 10
    números inteiros e os armazene em um array. Em seguida,
    o usuário deve digitar um número para buscar no array.
    O programa deve informar se o número está presente e
    em qual posição.
    Requisitos:
    • Criar um array de tamanho 10.
    • Solicitar um número ao usuário e verificar se ele
    está presente no array.
    • Se o número for encontrado, exibir sua posição. Caso
    contrário, exibir "Número não encontrado.".
*/
package pob.l04_arrays;

import java.util.Scanner;

public class Ex05BuscaElementoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            array[i]= sc.nextInt();
        }

        System.out.print("Informe um número para buscar: ");
        int num = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println(num + " encontrado na posição: " + i);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Número não encontrado.");
        }
    }
}