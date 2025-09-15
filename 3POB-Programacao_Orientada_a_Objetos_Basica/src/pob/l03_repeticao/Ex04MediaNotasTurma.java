/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Estruturas de Repetição em Java
   
    Exercício 4: Média de notas de uma turma
    Descrição:
    Desenvolva um programa que calcule a média das notas de uma
    turma, onde o usuário informe quantos alunos há na turma e suas
    respectivas notas.
    Requisitos:
    • O programa deve solicitar a quantidade de alunos.
    • Deve utilizar um loop for para receber as notas de cada aluno.
    • Utilizar um acumulador para somar todas as notas.
    • No final, exibir a média da turma.
*/
package pob.l03_repeticao;

import java.util.Scanner;

public class Ex04MediaNotasTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas = 0;

        System.out.print("Informe a quantidade de alunos: ");
        int alunos = sc.nextInt();

        for (int i = 1; i <= alunos; i++) {
            System.out.print("Informe a nota do " + i + 
            "º aluno: ");
            notas += sc.nextDouble();
        }

        double media = notas / alunos;

        System.out.println("A média da turma é: " + media);        

        sc.close();
    }
}