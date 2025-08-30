/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 28/08/2025
   
   ESTUDO DIRIGIDO
   Estruturas de Seleção IF-ELSE e Estrutura de Seleção Ternária
   
   Exercício 6: construir um programa em Java que leia o salário
   bruto e o sexo de um funcionário.
   Se o sexo for “M” (masculino), calcular, armazenar e imprimir
   um desconto de 5% e o salário líquido, caso contrário,
   calcular, armazenar e imprimir um desconto de 3% e o salário
   líquido.
*/
package pob.l01_selecao;

import java.util.Scanner;

public class Ex06CalculaSalarioLiquidoPorGenero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float desconto, salarioLiquido;

        System.out.print("Informe o salario bruto do funcionario: ");
        float salarioBruto = sc.nextFloat();

        System.out.print("Informe o sexo do funcionario (M ou F): ");
        char genero = sc.next().charAt(0);

        if (genero == 'M' || genero == 'm')
        {
            desconto = salarioBruto - ((salarioBruto * 95) / 100);
            
        } else {
            desconto = salarioBruto - ((salarioBruto * 97) / 100);
        }
        
        salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Salario Liquido: " + salarioLiquido);        

        sc.close();
    }
}