/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional
   
	QUESTÃO 02: 
	Elabore um algoritmo que, dada a idade de um 
	nadador, classifique-o em uma das seguintes 
	categorias:

	Categoria 			Faixa de idade 
	infantil A 			0 - 4 anos
	infantil B 			5 - 7 anos
	infantil C 			8-10 anos 
	juvenil A 			11-13 anos
	juvenil B 			14-17 anos 
	Adulto 				18 anos ou mais
*/
#include <stdio.h>

int main ()
{
	int idade;

	printf("Informe a idade do nadador: ");
	scanf("%d", &idade);

	if (idade < 0)
	{
		printf("\n\nValor invalido, encerrando...");
	}
	else if (idade <= 4)
	{
		printf("\n\nCategoria: Infantil A");
	}
	else if (idade <= 7)
	{
		printf("\n\nCategoria: Infantil B");
	}
	else if (idade <= 10)
	{
		printf("\n\nCategoria: Infantil C");
	}
	else if (idade <= 13)
	{
		printf("\n\nCategoria: Juvenil A");
	}
	else if (idade <= 17)
	{
		printf("\n\nCategoria: Juvenil B");
	}
	else
	{
		printf("\n\nCategoria: Adulto");
	}

	return 0;
}