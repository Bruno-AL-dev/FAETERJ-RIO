/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 03: 
	Construir um algoritmo que calcule o peso ideal 
	de uma pessoa, de acordo com o seu gênero e 
	altura, utilizando as seguintes fórmulas:  
	para homens:    (72.7*h)-58 
	para mulheres:  (62.1*h)-44.7
*/
#include <stdio.h>

int main ()
{
	char genero;
	float altura, pesoIdeal;
	
	printf("Informe seu genero (M ou F): ");
	scanf("%c", &genero);
	fflush(stdin);
	
	if (genero != 'M' && genero != 'm' && genero != 'F' && genero != 'f')
	{
		printf("\nGenero invalido! Encerrando...");
		return 0;
	}
	
	printf("\nInforme sua altura: ");
	scanf("%f", &altura);
	
	if (altura > 3)
	{
		altura /= 100;
	}
	
	switch (genero)
	{
		case 'M':
		case 'm':
			pesoIdeal = (72.7 * altura) - 58;
			
			printf("\nSeu peso ideal e': %2.f", pesoIdeal);
			break;
		case 'F':
		case 'f':
			pesoIdeal = (62.1 * altura) - 44.7;
			printf("\nSeu peso ideal e': %2.f", pesoIdeal);
			break;	
	}
	return 0;
}