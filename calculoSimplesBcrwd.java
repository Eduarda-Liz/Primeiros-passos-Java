/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
O valor deverá ser apresentado com 2 casas após o ponto.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
	int codigo1 = t.nextInt();
	int numPeca1 = t.nextInt();
	double valor1 = t.nextDouble();
	
	int codigo2 = t.nextInt();
	int numPeca2 = t.nextInt();
	double valor2 = t.nextDouble();
	
	double total = numPeca1*valor1 + numPeca2*valor2;
	System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
	t.close();
	}
}
