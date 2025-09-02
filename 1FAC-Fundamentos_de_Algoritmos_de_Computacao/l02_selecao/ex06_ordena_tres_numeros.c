/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 06: Escrever um algoritmo que, 
	dados um número inteiro i e três valores a, b e 
	c, apresente os 3 números na ordem definida 
	por i, como descrito abaixo: 

	a) i = 1: os três valores em ordem crescente; 
	b) i = 2: os três valores em ordem decrescente; 
	c) i = 3: o maior valor deve ser apresentado no 
	meio dos outros.
*/
#include <stdio.h>

int main ()
{
	int i, valorA, valorB, valorC, auxiliar;
	
	printf("Informe o primeiro valor: ");
	scanf("%d", &valorA);
	
	printf("\nInforme o segundo valor: ");
	scanf("%d" , &valorB);
	
	printf("\nInforme o terceiro valor: ");
	scanf("%d", &valorC);
	
	printf("\n\nAgora, escolha como quer que os valores sejam apresentados:");
	printf("\nAo digitar 1: os tres valores serao exibidos em ordem crescente;");
	printf("\nAo digitar 2: os tres valores serao exibidos em ordem decrescente;");
	printf("\nAo digitar 3: o maior valor sera apresentado no meio dos outros");
	printf("\nEscolha uma opcao: ");
	scanf("%d", &i);
	
	if (valorA < valorB)
	{
		auxiliar = valorA;
		valorA = valorB;
		valorB = auxiliar;
	}
	if (valorA < valorC)
	{
		auxiliar = valorA;
		valorA = valorC;
		valorC = auxiliar;
	}
	if (valorB > valorC)
	{
		auxiliar = valorB;
		valorB = valorC;
		valorC = auxiliar;
	}
	
	if (i == 1)
	{
		printf("\n%d, %d, %d", valorB, valorC, valorA);
	}else
	{
		if ( i == 2)
		{
			printf("\n%d, %d, %d", valorA, valorC, valorB);
		}else
		{
			printf("\n%d, %d, %d", valorB, valorA, valorC);
		}
	}
	
	return 0;
}