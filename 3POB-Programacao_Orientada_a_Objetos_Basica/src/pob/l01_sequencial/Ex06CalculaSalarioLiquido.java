/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 6: Cálculo do Salário
   Escreva um programa que receba o salário bruto de um
   funcionário e o valor de desconto do INSS. O programa deve
   calcular e exibir o salário líquido.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex06CalculaSalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: ");
        float salarioBruto = sc.nextFloat();

        System.out.print("Informe o desconto do INSS: ");
        float desconto = sc.nextFloat();        

        System.out.println("Salario Líquido: " +
        (salarioBruto - desconto));

        sc.close();
    }
}