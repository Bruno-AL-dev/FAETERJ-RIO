/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 01: 
	O custo ao consumidor de um carro novo é a 
	soma do custo de fábrica com a porcentagem 
	do distribuidor e dos impostos (aplicados ao 
	custo de fábrica). Desenvolver um algoritmo 
	que calcule o custo ao consumidor de 
	determinado carro.
*/
#include <stdio.h>

int main ()
{
	float custodeF, porcentagemDis, porcentagemImp, valorFinal;
	
	printf("Informe o custo de fabrica: ");
	scanf("%f", &custodeF);
	
	printf("\n\nInforme a porcentagem do distribuidor: ");
	scanf("%f", &porcentagemDis);
	
	printf("\n\nInforme a porcentagem dos impostos: ");
	scanf("%f", &porcentagemImp);
	
	valorFinal = custodeF + (custodeF * (porcentagemDis/100)) + (custodeF * (porcentagemImp/100));
	
	printf("O valor final e' de: %.2f", valorFinal);
	
	return 0;
}
