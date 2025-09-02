/* 
   FAETERJ-Rio
   Programação Orientada a Objetos Básica - POB - Manhã
   Aluno: Bruno Amador Lima
   Data: 02/09/2025
   
   Lista de Exercícios
   Estrutura Sequencial em Java
   
   Exercício 10: Distância Entre Dois Pontos
   Desenvolva um programa que leia as coordenadas x1, y1 e
   x2, y2 de dois pontos no plano cartesiano e calcule a
   distância entre eles.
   Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)
*/
package pob.l01_sequencial;

import java.util.Scanner;

public class Ex10CalculaDistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Informe o valor y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Informe o valor x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Informe o valor y2: ");
        double y2 = sc.nextDouble();

        double parteX = ((x2 - x1) * (x2 - x1));

        double parteY = ((y2 - y1) * (y2 - y1));

        double distancia = Math.sqrt(parteX + parteY);

        System.out.println("A distância entre os pontos (" + x1 +
        "," + y1 + ") e (" + x2 + "," + y2 + ") é: " + distancia);

        sc.close();
    }
}