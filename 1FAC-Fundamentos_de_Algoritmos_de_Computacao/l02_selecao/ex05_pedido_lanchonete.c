/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 05: O cardápio de uma lanchonete é 
	o seguinte:  

	Especificação		Código	Preço 
	Cachorro quente 	100 	3,50 
	Bauru simples 		101 	4,50 
	Bauru com ovo 		102 	5,20 
	Hamburger 			103 	3,00 
	Cheeseburger 		104 	4,00 
	Refrigerante 		105 	2,50 

	Escrever um algoritmo que obtenha o código 
	do item pedido, a quantidade e calcule o valor 
	a ser pago.  
	Considere que, a cada execução do algoritmo, 
	somente será calculado o valor relacionado a 
	um item.
*/
#include <stdio.h>

int main ()
{
	int codigo, quantidade, sair = 1;
	float valorPago;
	
	do
	{
		printf("	Cardapio da Lanchonete");
		printf("\nEspecificacao		Codigo	Preco");
		printf("\nCachorro quente		100 	3,50 ");
		printf("\nBauru simples		101 	4,50 ");
		printf("\nBauru com ovo 		102 	5,20 ");
		printf("\nHamburger 		103 	3,00 ");
		printf("\nCheeseburger 		104 	4,00 ");
		printf("\nRefrigerante 		105 	2,50 ");
		
		printf("\n\nSelecione um item do cardapio digitando o codigo do item: ");
		scanf("%d", &codigo);
		
		printf("\nInforme a quantidade: ");
		scanf("%d", &quantidade);
		
		switch (codigo)
		{
			case 100:
				valorPago = 3.50 * quantidade;
				break;
			case 101:
				valorPago = 4.50 * quantidade;
				break;
			case 102:
				valorPago = 5.20 * quantidade;
				break;
			case 103:
				valorPago = 3.00 * quantidade;
				break;
			case 104:
				valorPago = 4.00 * quantidade;
				break;
			case 105:
				valorPago = 2.50 * quantidade;
				break;
		}
		
		printf("\nValor a ser pago: R$ %.2f", valorPago);
		printf("\n\nDigite 1 para verificar o valor de outro item ou 0 para Sair: ");
		scanf("%d", &sair);
	} while (sair);
	
	return 0;
}