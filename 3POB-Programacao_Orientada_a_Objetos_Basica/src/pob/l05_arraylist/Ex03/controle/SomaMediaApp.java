/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 29/09/2025
   
    Lista de Exercícios
    Manipulação de ArrayList em Java
   
    Exercício 3: Soma de Números e Cálculo da Média
    Descrição:
    Crie um programa que solicite ao usuário inserir números em
    um ArrayList<Double> até que ele digite -1. Depois, exiba a
    soma e a média dos números inseridos (excluindo o -1).
    Requisitos:
    • Criar um ArrayList<Double> para armazenar os números.
    • Utilizar um loop while para permitir inserções até o
    usuário digitar -1.
    • Utilizar um loop for para calcular a soma e a média dos
    números inseridos.
*/
package pob.l05_arraylist.Ex03.controle;

import java.util.Scanner;

import pob.l05_arraylist.Ex03.dominio.CalculadoraLista;

public class SomaMediaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraLista calculadora = new CalculadoraLista();
        
        System.out.println("Digite os números (digite -1 para parar):");
        System.out.print("> ");
        double numeroEntrada;
        while ((numeroEntrada = sc.nextDouble()) != -1) {
            System.out.print("> ");
            calculadora.adicionarNumero(numeroEntrada);
        }

        System.out.println("Números inseridos: " + calculadora.getNumeros());
        System.out.println("Soma dos números: " + calculadora.calcularSoma());
        System.out.println("Média dos números: " + calculadora.calcularMedia());

        sc.close();
    }
}