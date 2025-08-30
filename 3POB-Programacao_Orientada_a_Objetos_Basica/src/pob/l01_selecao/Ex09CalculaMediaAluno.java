/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 9: construir um programa em Java que leia as 2
   notas de um aluno e que calcule, armazene e imprima a média.
   Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
   contrário, realizar a leitura de uma terceira nota, que terá
   peso 2 e calcular, armazenar e imprimir uma nova média. Se a
   nova média for maior ou igual a 6, imprimir “Aprovado”, caso
   contrário, imprimir “Reprovado”.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex09CalculaMediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.print("Informe a terceira nota: ");
            float nota3 = sc.nextFloat();

            float novaMedia = (media + (nota3 * 2)) / 3;

            System.out.println("Nova Media: " + novaMedia);

            if(novaMedia >=6){
               System.out.println("Aprovado");
            } else {
               System.out.println("Reprovado");
            }
        }
        sc.close();
    }
}