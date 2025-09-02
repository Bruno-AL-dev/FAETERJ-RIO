/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária
   
   Exercício 4: construir um programa em Java que leia um
   número inteiro e imprima “PAR”, se o número for par e 
   imprima “ÍMPAR”, se o número for ímpar.
*/
package pob.l02_selecao;

import java.util.Scanner;

public class Ex04VerificaParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}