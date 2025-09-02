/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 02
	Exercícios com Estruturas de Seleção (if/else e switch)

	QUESTÃO 02: Escrever um algoritmo que 
	obtenha o peso de uma pessoa na Terra e o 
	número de um planeta. Ao final, com auxílio da 
	tabela abaixo, calcular o peso desta pessoa no 
	planeta escolhido. 

	Número 	Planeta 	Gravidade Relativa g 
	1 	Mercúrio 			0,37 
	2 	Vênus 				0,88 
	3 	Marte 				0,38 
	4 	Júpiter 			2,64 
	5 	Saturno 			1,15 
	6 	Urano 				1,17 

	Para calcular o peso no planeta escolhido, 
	utilize a seguinte fórmula: 

	pesoPlaneta = (pesoTerra/10) * gravidadePlaneta
*/
#include <stdio.h>
#include <string.h>

int main ()
{
	float pesoTerra, pesoPlaneta, gravidade;
	int numeroPlaneta;
	char nomePlaneta[10];
	
	printf("Informe o peso da pessoa na Terra: ");
	scanf("%f", &pesoTerra);
	
	printf("\nNumero 	Planeta");
	printf("\n   1 	Mercurio ");
	printf("\n   2 	Venus ");
	printf("\n   3 	Marte ");
	printf("\n   4 	Jupiter ");
	printf("\n   5 	Saturno ");
	printf("\n   6 	Urano ");
	
	printf("\n\nEscolha um planeta da tabela: ");
	scanf("%d", &numeroPlaneta);
	
	switch (numeroPlaneta)
	{
		case 1:
			gravidade = 0.37;
			strcpy (nomePlaneta, "Mercurio");
			break;
		case 2:
			gravidade = 0.88;
			strcpy (nomePlaneta, "Venus");
			break;
		case 3:
			gravidade = 0.38;
			strcpy (nomePlaneta, "Marte");
			break;
		case 4:
			gravidade = 2.64;
			strcpy (nomePlaneta, "Jupiter");
			break;
		case 5:
			gravidade = 1.15;
			strcpy (nomePlaneta, "Saturno");
			break;
		case 6:
			gravidade = 1.17;
			strcpy (nomePlaneta, "Urano");
			break;
		default:
			printf("\nOpcao invalida, encerrando...");
			return 0;
	}
	
	pesoPlaneta = (pesoTerra/10) * gravidade;
	
	printf("\n\nO peso dessa pessoa no planeta %s e': %.2f kg", nomePlaneta, pesoPlaneta);
	
	return 0;
}