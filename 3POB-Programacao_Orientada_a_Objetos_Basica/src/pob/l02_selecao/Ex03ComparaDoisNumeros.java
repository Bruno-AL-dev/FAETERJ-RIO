/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 3: construir um programa em Java que leia 2 números
   inteiros e imprima o maior número lido.
*/
package pob.l02_selecao;

import java.util.Scanner;

public class Ex03ComparaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 >= num2)
        {
            System.out.println("Maior numero lido: " + num1);
        } else {
            System.out.println("Maior numero lido: " + num2);
        }

        sc.close();
    }
}