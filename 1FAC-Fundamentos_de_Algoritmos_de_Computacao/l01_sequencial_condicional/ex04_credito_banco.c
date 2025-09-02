/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 04: 
	Um banco concederá um crédito especial aos 
	seus clientes, variável com o saldo médio no 
	último ano. Faça um algoritmo que calcule o 
	valor do crédito de acordo com a tabela abaixo. 
	Saldo Médio						Percentual 
	Inferior a R$ 1000,00			nenhum crédito 
	De R$ 1000,00 a R$ 1499,99 		20% do saldo médio 
	De R$ 1500,00 a R$ 2499,99 		30% do saldo médio 
	R$ 2500,00 ou mais 				40% do saldo médio
*/
#include <stdio.h>

int main ()
{
	float saldoMedio, valorCredito;
	
	printf("Informe seu saldo medio no ultimo ano: ");
	scanf("%f", &saldoMedio);
	
	if (saldoMedio >= 2500)
	{
		valorCredito = (saldoMedio * 40) / 100;
	}else
	{
		if (saldoMedio >= 1500)
		{
			valorCredito = (saldoMedio * 30) / 100;
		}else
		{
			if (saldoMedio >= 1000)
			{
				valorCredito = (saldoMedio * 20) / 100;
			}else
			{
				printf("Voce nao possui credito especial!");
				return 0;
			}
		}
	}
	
	printf("\nVoce possui: R$ %.2f de credito especial", valorCredito);
	
	return 0;
}