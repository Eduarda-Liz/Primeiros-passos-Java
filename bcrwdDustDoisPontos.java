/******************************************************************************

Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de 
ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double x1 = keyboard.nextDouble();
	double y1 = keyboard.nextDouble();
	double x2 = keyboard.nextDouble();
	double y2 = keyboard.nextDouble();
	double calculo = Math.sqrt(Math.pow((x2-x1), 2)+(Math.pow((y2-y1),2)));
	
	System.out.printf("%.4f\n" , calculo);
	
	keyboard.close();
	}
}
