/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 04: Desenvolva um algoritmo que 
	calcule o consumo de combustível de um 
	automóvel em determinada viagem. Para isso, 
	devem ser obtidos:
	i) o percurso (em quilômetros) da viagem;
	ii) o número de quilômetros que o carro percorre
		com um litro de combustível (km/l); e
	iii) o preço do litro do combustível.  
 
	Ao final, o algoritmo deve determinar: 
		A quantidade de combustível, em litros,
		consumida durante a viagem; 
		O custo total de combustível.
*/
#include <stdio.h>

int main ()
{
	float distancia, kmLitro, precoCombustivel, quantidadeConsumida, custoTotal;
	
	printf("Informe o percurso (em quilometros) da viagem: ");
	scanf("%f", &distancia);
	
	printf("Informe o numero de quilometros que o carro percorre com um litro de combustivel (km/l): ");
	scanf("%f", &kmLitro);
	
	printf("Informe o preco do litro de combustivel: ");
	scanf("%f", &precoCombustivel);
	
	quantidadeConsumida = distancia / kmLitro;
	
	custoTotal = quantidadeConsumida * precoCombustivel;
	
	printf("\nA quantidade de combustivel, em litros, consumida durante a viagem: %.2f", quantidadeConsumida);
	printf("\nO custo total de combustivel: R$ %.2f", custoTotal);
	
	return 0;
}