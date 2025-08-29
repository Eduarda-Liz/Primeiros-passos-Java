// CONDICIONAIS PARTE 1

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Calculadora de notas");
	System.out.prin("Insira a primeira nota: ");
	float n1 = keyboard.nextFloat();
	System.out.print("Insira a segunda nota: ");
	float n2 = keyboard.nextFloat();
	float m = (n1+n2)/2;
	System.out.printf("Sua média foi: %.2f\n", m);
	    if (m>9) {
	        System.out.print("Parabéns!!");
	    } /*a condição IF (se) deve ser fechada. Caso não precise fazer mais nada após
	    a condição, não precisa por o else*/
	keyboard.close();
	}
}
