/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 03: As vendas parceladas se 
	tornaram uma ótima opção para os lojistas que, 
	a cada dia, criam novas promoções para tentar 
	conquistar novos clientes. Faça um algoritmo 
	que permita ao lojista informar o preço do 
	produto e receber as seguintes informações: 

	a) O valor com 10% de desconto para 
	pagamento à vista; 
	b) O valor da prestação para parcelamento 
	sem juros, em 5x; 
	c) O valor da prestação para parcelamento 
	com juros, em 10x, com 20% de acréscimo 
	no valor do produto.
*/
#include <stdio.h>

int main ()
{
	float valorProduto;
	
	printf("Informe o valor do produto: ");
	scanf("%f", &valorProduto);
	
	printf("\nValor com 10%% de desconto a vista: R$ %.2f", valorProduto * 0.9);
	printf("\nValor da prestacao para parcelamento sem juros, em 5x: R$ %.2f", valorProduto / 5);
	printf("\nValor da prestacao para parcelamento com juros, em 10x, com 20%% de acrescimo no valor do produto: R$ %.2f", ((valorProduto * 1.2) / 10));
	
	return 0;
}