/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 29/09/2025
   
    Lista de Exercícios
    Manipulação de ArrayList em Java
   
    Exercício 1: Adicionar e Exibir Números
    Descrição:
    Crie um programa que permita ao usuário inserir quantos
    números desejar em um ArrayList<Integer>. Após a inserção, o
    programa deve exibir todos os números digitados.
    Requisitos:
    • Criar um ArrayList<Integer> para armazenar os números.
    • Utilizar um loop while para permitir múltiplas inserções
    até o usuário decidir parar.
    • Exibir os números armazenados no ArrayList.
*/
package pob.l05_arraylist.Ex01.controle;

import java.util.Scanner;

import pob.l05_arraylist.Ex01.dominio.ArmazenadorNumeros;

public class AdicionarExibirApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmazenadorNumeros armazenador = new ArmazenadorNumeros();

        System.out.println("Digite números inteiros (digite 'sair' para finalizar):");

        while (true) {
            System.out.print("> ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            int numero = Integer.parseInt(entrada);
            armazenador.adicionarNumero(numero);
        }

        System.out.println("\nNúmeros Digitados:");
        System.out.println(armazenador.getNumeros());

        sc.close();
    }
}