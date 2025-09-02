/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 05: 
	Escrever um algoritmo que, dada uma quantia 
	em reais, calcule o menor número possível de 
	notas/moedas (100, 50, 20, 10, 5, 2 e 1) em que 
	o valor pode ser decomposto.
*/
#include <stdio.h>

int main ()
{
	int quantia, resto;
	
	printf("Informe a quantia: ");
	scanf("%d", &quantia);
	
	printf("\nO valor pode ser decomposto em:\n");
	
	if (quantia >= 100)
	{
		resto = quantia % 100;
		quantia /= 100;
		printf("\n%d Nota(s) de R$ 100.00", quantia);
		quantia = resto;
	}
	if (quantia >= 50)
	{
		resto = quantia % 50;
		quantia /= 50;
		printf("\n%d Nota(s) de R$ 50.00", quantia);
		quantia = resto;
	}
	if (quantia >= 20)
	{
		resto = quantia % 20;
		quantia /= 20;
		printf("\n%d Nota(s) de R$ 20.00", quantia);
		quantia = resto;
	}
	if (quantia >= 10)
	{
		resto = quantia % 10;
		quantia /= 10;
		printf("\n%d Nota(s) de R$ 10.00", quantia);
		quantia = resto;
	}
	if (quantia >= 5)
	{
		resto = quantia % 5;
		quantia /= 5;
		printf("\n%d Nota(s) de R$ 5.00", quantia);
		quantia = resto;
	}
	if (quantia >= 2)
	{
		resto = quantia % 2;
		quantia /= 2;
		printf("\n%d Nota(s) de R$ 2.00", quantia);
		quantia = resto;
	}
	if (quantia == 1)
	{
		printf("\n%d Nota(s) de R$ 2.00", quantia);
	}
	return 0;
}