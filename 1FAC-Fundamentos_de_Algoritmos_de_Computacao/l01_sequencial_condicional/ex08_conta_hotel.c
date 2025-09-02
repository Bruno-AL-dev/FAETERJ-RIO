/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 08: 
	Faça um algoritmo para calcular a conta final de 
	um hóspede de um hotel, considerando que: 
	a) Devem ser obtidos o nome do hóspede, o 
	tipo do apartamento utilizado (A, B, C ou D), 
	o número de diárias utilizadas pelo hóspede 
	e o valor do consumo interno do hóspede; 
	b) O valor da diária é determinado pela 
	seguinte tabela: 
	Tipo de Apartamento Valor da diária 
			A 				R$ 350,00 
			B 				R$ 275,00  
			C				R$ 200,00 
			D				R$ 150,00 
	c) O valor da taxa de serviço equivale a 
	10% da conta. 
	A conta a ser apresentada ao cliente deve 
	conter: o nome do hóspede, o tipo do 
	apartamento, o valor total das diárias, o 
	valor do consumo interno, o subtotal, o 
	valor da taxa de serviço e o total geral.
*/
#include <stdio.h>
#include <string.h>
int main ()
{
	char nome[20], tipoApartamento;
	int numDiarias;
	float valorConsumo, valorDiaria, subtotal, totalGeral, taxaServico;
	
	printf("Informe o nome do hospede: ");
	gets(nome);
	
	printf("\nInforme o tipo de apartamento utilizado: ");
	scanf("%c", &tipoApartamento);
	fflush(stdin);
	
	printf("\nInforme o numero de diarias utilizadas pelo hospede: ");
	scanf("%d", &numDiarias);
	
	printf("\nInforme o valor do consumo interno do hospede: ");
	scanf("%f", &valorConsumo);
	
	switch (tipoApartamento)
	{
		case 'a':
		case 'A':
			valorDiaria = numDiarias * 350;
			break;
		case 'b':
		case 'B':
			valorDiaria = numDiarias * 275;
			break;
		case 'c':
		case 'C':
			valorDiaria = numDiarias * 200;
			break;
		case 'd':
		case 'D':
			valorDiaria = numDiarias * 150;
			break;
	}
	
	subtotal = valorDiaria + valorConsumo;
	taxaServico = subtotal * 0.1;
	totalGeral = taxaServico + subtotal;
	
	printf("\n\nConta do Cliente");
	printf("\nNome do Hospede: %s", nome);
	printf("\nTipo de Apartamento: '%c'", tipoApartamento);
	printf("\nValor total das diarias: R$ %.2f", valorDiaria);
	printf("\nValor do consumo interno: R$ %.2f", valorConsumo);
	printf("\nSubtotal: R$ %.2f", subtotal);
	printf("\nValor da taxa de servico: R$ %.2f", taxaServico);
	printf("\nTotal geral: R$ %.2f", totalGeral);
	
	return 0;
}