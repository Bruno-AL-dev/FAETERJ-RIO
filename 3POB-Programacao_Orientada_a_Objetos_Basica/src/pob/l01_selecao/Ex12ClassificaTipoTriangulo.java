/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 12: construir um programa em Java que leia os
   valores de A, B e C e que imprima “Não forma triângulo”, se
   um dos valores for maior que a soma dos outros 2, caso
   contrário, imprimir qual é o tipo do triângulo, que pode ser
   “Equilátero”, se tiver os 3 lados iguais, “Isósceles”, se
   tiver 2 lados iguais e “Escaleno”, se os 3 lados forem
   diferentes.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex12ClassificaTipoTriangulo {
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
        } else if (valorA == valorB && valorB == valorC) {
            System.out.print("Tipo do triângulo: Equilátero");
        } else if (valorA == valorB || valorB == valorC || 
        valorC == valorA) {
         System.out.print("Tipo do triângulo: Isósceles");
        } else {
         System.out.print("Tipo do triângulo: Escaleno");
        }
        
        sc.close();
    }
}