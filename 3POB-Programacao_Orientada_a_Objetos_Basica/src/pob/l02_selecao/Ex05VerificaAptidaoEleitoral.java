/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 5: construir um programa em Java que leia o ano de
   nascimento de uma pessoa e que calcule a sua idade
   aproximada. Se a idade aproximada for maior ou igual a 16,
   imprimir “Apto a ser eleitor”, imprimir “Inapto a ser
   eleitor”, caso contrário.
*/
package pob.l02_selecao;

import java.util.Scanner;

public class Ex05VerificaAptidaoEleitoral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int ano = sc.nextInt();

        if (2025 - ano >= 16)
        {
            System.out.println("Apto a ser eleitor");
        } else {
            System.out.println("Inapto a ser eleitor");
        }

        sc.close();
    }
}