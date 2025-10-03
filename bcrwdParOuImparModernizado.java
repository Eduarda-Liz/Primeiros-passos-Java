/*Como bons irmãos, Lucas e Paulo decidem tudo com o jogo par ou ímpar. Quem lava a louça, quem toma banho primeiro, quem pode ir no banco da frente... 

Porém, como tudo gira em torno da tecnologia hoje em dia, eles decidiram que estava na hora de modernizar o clássico par ou ímpar.*/

import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num1 = keyboard.nextInt();
	int num2 = keyboard.nextInt();
	int soma = num1 + num2;
	if (soma % 2 == 0) {
	    System.out.println("EVEN");
	} else {
	    System.out.println("ODD");
	}
	
	
	keyboard.close();
	}
}
