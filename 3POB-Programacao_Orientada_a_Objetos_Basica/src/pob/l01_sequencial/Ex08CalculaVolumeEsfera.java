/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 8: Cálculo do Volume de uma Esfera
   Crie um programa que leia o raio de uma esfera e calcule o
   seu volume.
   Fórmula: V = (4/3) * π * raio³.
   Use π = 3.14159.
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex08CalculaVolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0/3.0) * 3.14159 * (raio * raio * raio);

        System.out.println("O volume da esfera é: " + volume);

        sc.close();
    }
}