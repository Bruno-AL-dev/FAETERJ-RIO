/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 30/09/2025
   
    Lista de Exercícios
    Manipulação de ArrayList em Java
   
    Exercício 5: Ordenação de Lista de Números
    Descrição:
    Crie um programa que solicite ao usuário inserir quantos
    números desejar em um ArrayList<Integer>. Em seguida, ordene
    os números em ordem crescente e exiba a lista ordenada.
    Requisitos:
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar Collections.sort() para ordenar os números.
    • Exibir a lista ordenada após a ordenação.
*/
package pob.l05_arraylist.Ex05.controle;

import java.util.Scanner;

import pob.l05_arraylist.Ex05.dominio.OrdenadorLista;

public class OrdenacaoListaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrdenadorLista ordenador = new OrdenadorLista();

        System.out.println("Digite números inteiros (digite 'fim' para parar):");

        while (true) {
            System.out.print("> ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);
            ordenador.adicionarNumero(numero);
        }

        System.out.println("\nLista original: " + ordenador.getNumeros());

        ordenador.ordenar();

        System.out.println("Lista ordenada: " + ordenador.getNumeros());

        sc.close();
    }
}