/*faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem 
“eh o maior”. Utilize a fórmula: MaiorAB = (a + b + |a - b|) / 2


Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".*/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int valor1 = keyboard.nextInt();
	int valor2 = keyboard.nextInt();
	int valor3 = keyboard.nextInt();
	
	int maiorAB = (valor1 + valor2 + Math.abs(valor1 - valor2)) /2 ;  
	int maiorBC = (valor2 + valor3 + Math.abs(valor2 - valor3)) /2 ;
	int maiorTodos = (maiorAB + maiorBC + Math.abs(maiorAB - maiorBC))/2;
	
	System.out.println(maiorTodos + " eh o maior");
	keyboard.close();
	}
}
