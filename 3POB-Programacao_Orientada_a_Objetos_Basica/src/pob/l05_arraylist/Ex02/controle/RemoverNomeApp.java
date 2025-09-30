/* 
    FAETERJ-Rio
    Programação Orientada a Objetos Básica - POB - Manhã
    Aluno: Bruno Amador Lima
    Data: 29/09/2025
   
    Lista de Exercícios
    Manipulação de ArrayList em Java
   
    Exercício 2: Remover um Elemento da Lista
    Descrição:
    Escreva um programa que solicite ao usuário inserir 5 nomes
    em um ArrayList<String>. Em seguida, peça para o usuário
    informar um nome para ser removido da lista. Exiba a lista
    após a remoção.
    Requisitos:
    • Criar um ArrayList<String> para armazenar os nomes.
    • Utilizar remove() para excluir o nome informado.
    • Se o nome não existir na lista, exibir uma mensagem
    informando.
*/
package pob.l05_arraylist.Ex02.controle;

import java.util.Scanner;

import pob.l05_arraylist.Ex02.dominio.GerenciadorNomes;

public class RemoverNomeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorNomes gerenciador = new GerenciadorNomes();

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º nome: ");
            gerenciador.adicionarNome(sc.nextLine());
        }

        System.out.println("\nLista atual: " + gerenciador.getNomes());

        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeParaRemover = sc.nextLine();

        boolean foiRemovido = gerenciador.removerNome(nomeParaRemover);

        if (foiRemovido) {
            System.out.println("'" + nomeParaRemover + "' foi removido com sucesso.");
        } else {
            System.out.println("O nome '" + nomeParaRemover + "' não foi encontrado na lista.");
        }

        System.out.println("Lista final: " + gerenciador.getNomes());

        sc.close();
    }
}