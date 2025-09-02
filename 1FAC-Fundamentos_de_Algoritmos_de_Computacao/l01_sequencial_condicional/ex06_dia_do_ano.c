/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 06: 
	Fazer um algoritmo que determine a ordem de 
	uma data (dia e mês) no ano. 
	Exemplos:  
	01/01 - 1º dia do ano 
	03/02 - 34º dia do ano
*/
#include <stdio.h>
int main ()
{
	int data, mes, contador = 0;
	
	printf("Infome uma data: ");
	scanf("%d", &data);
	
	if (data <= 0 || data >=32)
	{
		printf("\nData invalida, encerrando...");
		return 0;
	}
	
	printf("\nInforme o mes: ");
	scanf("%d", &mes);
	
	switch (mes)
	{
		case 1:
			break;
		case 2:
			if (data > 28)
			{
				printf("\nData invalida para o mes selecionado, encerrando...");
				return 0;
			}
			contador = 31;
			break;
		case 3:
			contador = 59;
			break;
		case 4:
			if (data > 30)
			{
				printf("\nData invalida para o mes selecionado, encerrando...");
				return 0;
			}
			contador = 90;
			break;
		case 5:
			contador = 120;
			break;
		case 6:
			if (data > 30)
			{
				printf("\nData invalida para o mes selecionado, encerrando...");
				return 0;
			}
			contador = 151;
			break;
		case 7:
			contador = 181;
			break;
		case 8:
			contador = 212;
			break;
		case 9:
			if (data > 30)
			{
				printf("\nData invalida para o mes selecionado, encerrando...");
				return 0;
			}
			contador = 243;
			break;
		case 10:
			contador = 273;
			break;
		case 11:
			if (data > 30)
			{
				printf("\nData invalida para o mes selecionado, encerrando...");
				return 0;
			}
			contador = 304;
			break;
		case 12:
			contador = 334;
			break;
		default: printf("\nMes invalido, encerrando...");
				 return 0;
	}
	
	if (contador)
	{
		contador += data;
	}
	
	printf("\n\n%2.d/%.2d - %do dia do ano", data, mes, contador);	
	
	return 0;
}