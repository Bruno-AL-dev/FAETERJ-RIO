/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 11: construir um programa em Java que leia os
   valores de A, B e C e que imprima “Não forma triângulo”, se
   um dos valores for maior que a soma dos outros 2, caso
   contrário, imprimir “Forma triângulo”.
*/
package pob.l02_selecao;

import java.util.Scanner;

public class Ex11VerificaCondicaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        int valorA = sc.nextInt();

        System.out.print("Informe o valor B: ");
        int valorB = sc.nextInt();

        System.out.print("Informe o valor C: ");
        int valorC = sc.nextInt();

        if (valorA >= valorB + valorC || 
        valorB >= valorA + valorC ||
        valorC >= valorA + valorB) {
            System.out.print("Não forma triângulo");
        } else {
            System.out.print("Forma triângulo");
        }
        
        sc.close();
    }
}