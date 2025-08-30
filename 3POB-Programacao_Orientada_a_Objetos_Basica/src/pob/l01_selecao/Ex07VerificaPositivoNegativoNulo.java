/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 7: construir um programa em Java que leia um número
   inteiro e imprima “Positivo”, se o número lido for maior que
   0, imprima “Negativo”, se o número lido for menor que 0 e 
   imprima “Nulo”, se o número lido for igual a 0.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex07VerificaPositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero Inteiro: ");
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.print("Positivo");
        } else if (num < 0) {
            System.out.print("Negativo");  
        } else {
            System.out.print("Nulo");  
        }
        
        sc.close();
    }
}