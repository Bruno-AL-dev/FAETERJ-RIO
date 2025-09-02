/* 
	FAETERJ-Rio
	Fundamentos de Algoritmos de Computação - 1FAC - Manhã
	Aluno: Bruno Amador Lima

	Lista de Exercícios 01
	Exercícios de Estrutura Sequencial e Condicional

	QUESTÃO 07: 
	Escreva um algoritmo para calcular o salário 
	semanal de uma pessoa, determinado pelas 
	condições que seguem: se o número de horas 
	trabalhado for inferior ou igual a 40, a pessoa 
	recebe x reais por hora; caso contrário, a 
	pessoa recebe um adicional de 50% para cada 
	hora trabalhada acima das 40 iniciais.
*/
#include <stdio.h>

int main ()
{
	float salarioHora = 100, salario;
	int quantidadeHoras;
	
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%d", &quantidadeHoras);
	
	if (quantidadeHoras <= 40)
	{
		salario = salarioHora  * quantidadeHoras;
	}
	else
	{
		salario = salarioHora * 40 + (quantidadeHoras - 40) * salarioHora * 1.5;
	}
	
	printf("\n\nSalario: R$ %.2f", salario);
	
	
	return 0;
}