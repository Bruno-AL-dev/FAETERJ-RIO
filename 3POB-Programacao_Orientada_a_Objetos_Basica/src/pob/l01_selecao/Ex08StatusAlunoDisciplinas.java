/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária
   
   Exercício 8: construir um programa em Java que leia a
   quantidade de disciplinas em que um aluno não alcançou a
   média. Se a quantidade for igual a 0, imprimir “Aprovado”,
   se a quantidade for menor ou igual a 5, imprimir
   “Recuperação” e se a quantidade for maior que 5, imprimir
   “Reprovado”.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex08StatusAlunoDisciplinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de " +
        "disciplinas em que o aluno não alcançou a média: ");
        int quantidadeDisciplinas = sc.nextInt();

        if (quantidadeDisciplinas == 0)
        {
            System.out.print("Aprovado");
        } else if (quantidadeDisciplinas <= 5) {
            System.out.print("Recuperação");  
        } else {
            System.out.print("Reprovado");  
        }
        
        sc.close();
    }
}