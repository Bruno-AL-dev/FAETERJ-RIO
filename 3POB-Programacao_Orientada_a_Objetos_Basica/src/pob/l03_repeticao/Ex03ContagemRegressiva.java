/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 03/09/2025
   
    Lista de Exercícios
    Estruturas de Repetição em Java
   
    Exercício 3: Contagem regressiva usando do-while
    Descrição:
    Crie um programa que solicite um número ao usuário e faça uma
    contagem regressiva até 0, utilizando um loop do-while.
    Requisitos:
    • O programa deve solicitar um número inteiro positivo ao usuário.
    • Utilizar um contador decrescente para reduzir o valor até 0.
    • Exibir os números da contagem regressiva um por um.
*/
package pob.l03_repeticao;

import java.util.Scanner;

public class Ex03ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int num = sc.nextInt();

        int i = num;

        System.out.println("Contagem regressiva de " + num +
        "até 0");

        do {
            System.out.println(i);
            i--;
        } while (i >= 0);

        sc.close();
    }
}