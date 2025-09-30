/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 30/09/2025
   
    Lista de Exercícios
    Manipulação de ArrayList em Java
   
    Exercício 4: Contagem de Ocorrências de um Número
    Descrição:
    Desenvolva um programa que solicite ao usuário inserir 10
    números inteiros em um ArrayList<Integer>. Depois, peça ao
    usuário para digitar um número e informe quantas vezes esse
    número aparece na lista.
    Requisitos:
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar um loop for para contar quantas vezes o número
    aparece na lista.
    • Exibir a quantidade de ocorrências do número digitado pelo
    usuário.
*/
package pob.l05_arraylist.Ex04.controle;

import java.util.Scanner;

import pob.l05_arraylist.Ex04.dominio.ContadorOcorrencias;

public class ContagemOcorrenciasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContadorOcorrencias contador = new ContadorOcorrencias();

        System.out.println("Por favor, insira 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            int numero = sc.nextInt();
            contador.adicionarNumero(numero);
        }

        System.out.println("\nLista de números inseridos: " + contador.getNumeros());

        System.out.print("\nDigite um número para contar as ocorrências: ");
        int numeroParaBuscar = sc.nextInt();

        int quantidade = contador.contar(numeroParaBuscar);

        if (quantidade == 1) {
            System.out.println("O número " + numeroParaBuscar + " aparece " + quantidade + " vez na lista.");
        } else {
            System.out.println("O número " + numeroParaBuscar + " aparece " + quantidade + " vezes na lista.");
        }

        sc.close();
    }
}

