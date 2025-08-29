// CONDICIONAL COMPOSTA

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Calculadora de idade");
	System.out.print("Insira seu ano de nascimento: ");
	float nascimento = keyboard.nextFloat();
	float idade = 2025 - nascimento;
	System.out.println("Sua idade é " + idade);
	    if (idade>=18) {
	        System.out.print("Você é maior de 18 anos!!"); // O bloco abre e fecha
	    } else {
	        System.out.print("Você é menor"); //Segundo bloco abre e fecha
	    } 
	    
	keyboard.close();
	}
}
/* Os blocos de códigos condicionais precisam ser fechados! Importante, não esquecer*/
