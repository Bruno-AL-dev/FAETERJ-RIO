/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária

   Exercício 10: construir um programa em Java que leia o ano de
   nascimento e o sexo de uma pessoa e que calcule a sua idade
   aproximada. Se o sexo for igual a “M” (masculino) e a idade
   for igual a 18, imprimir “Serviço Militar Obrigatório”, caso
   contrário, imprimir “Isento de Serviço Militar”.
*/
package pob.l02_selecao;

import java.util.Scanner;

public class Ex10VerificaServicoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float desconto, salarioLiquido;

        System.out.print("Informe o ano de nascimento: ");
        int ano = sc.nextInt();

        System.out.print("Informe o sexo (M ou F): ");
        char genero = sc.next().charAt(0);

        if (genero == 'M' || genero == 'm' && 2025 - ano >= 18)
        {
            System.out.print("Serviço Militar Obrigatório");
        } else {
            System.out.print("Isento de Serviço Militar");
        }
        sc.close();
    }
}