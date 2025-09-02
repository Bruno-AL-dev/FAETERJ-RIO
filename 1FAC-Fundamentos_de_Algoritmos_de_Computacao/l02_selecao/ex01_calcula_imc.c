/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 01: O IMC (Índice de Massa Corporal) 
	é um critério da Organização Mundial de Saúde 
	para dar uma indicação sobre a condição de 
	peso de uma pessoa adulta. A fórmula é: 
	
	IMC = peso / altura^2 
	
	Elabore um algoritmo que, dados o peso e a 
	altura de um adulto, determine a sua condição 
	de acordo com a tabela abaixo: 
	
	IMC em adultos Condição 
	IMC < 18,5 Abaixo do peso 
	18,5 ≤ IMC < 25,0 Peso ideal 
	25,0 ≤ IMC < 30,0 Sobrepeso 
	30,0 ≤ IMC < 35,0 Obesidade grau I 
	35,0 ≤ IMC < 40,0 Obesidade grau II 
	IMC ≥ 40,0 Obesidade grau III
*/
#include <stdio.h>

int main ()
{
	float peso, altura, IMC;
	
	printf("Informe o peso: ");
	scanf("%f", &peso);
	
	printf("\nInforme a altura: ");
	scanf("%f", &altura);
	
	if (altura > 3)
	{
		altura /= 100;
	}
	
	IMC = peso / (altura * altura);
	
	if (IMC < 18.5)
	{
		printf("\n\nAbaixo do peso");
	}
	else
	{
		if (IMC < 25)
		{
			printf("\n\nPeso ideal");
		}
		else
		{
			if(IMC < 30)
			{
				printf("\n\nSobrepeso");
			}
			else
			{
				if (IMC < 35)
				{
					printf("\n\nObesidade grau I");
				}
				else
				{
					if(IMC < 40)
					{
						printf("\n\nObesidade grau II");
					}
					else
					{
						printf("\n\nObesidade grau III");
					}
				}
			}
		}
	}
	return 0;
}