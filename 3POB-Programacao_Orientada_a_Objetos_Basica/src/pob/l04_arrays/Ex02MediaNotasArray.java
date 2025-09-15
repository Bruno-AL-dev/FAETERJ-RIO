/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Manipulação de Arrays em Java
   
    Exercício 2: Cálculo da Média de Notas
    Descrição:
    Desenvolva um programa que peça ao usuário para inserir 4
    notas e armazene-as em um array. Depois, o programa deve
    calcular e exibir a média das notas.
    Requisitos:
    • Criar um array de tamanho 4 para armazenar as notas.
    • Utilizar um loop for para somar todas as notas e
    calcular a média.
    • Se a média for maior ou igual a 7, exibir "Aprovado",
    senão, exibir "Reprovado".
*/
package pob.l04_arrays;

import java.util.Scanner;

public class Ex02MediaNotasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i+1) + "º nota: ");
            notas[i]= sc.nextDouble();
        }

        double somaNotas = 0;

        for (int i = 0; i < 4; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}