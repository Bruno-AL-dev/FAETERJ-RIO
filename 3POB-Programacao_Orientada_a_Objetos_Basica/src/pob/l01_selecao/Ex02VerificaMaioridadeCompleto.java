/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 2: construir um programa em Java que leia a idade
   de uma pessoa e imprima “Maior de idade”, se a idade lida
   for maior ou igual a 18 e imprima “Menor de idade”, caso
   contrário.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex02VerificaMaioridadeCompleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade >= 18)
        {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}