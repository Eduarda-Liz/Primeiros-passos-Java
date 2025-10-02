/*Alberto estava fazendo um trabalho da faculdade quando percebeu que seu computador estava com defeito. 
Todos os números que ele escreve aparecem sem os sinais e, como é um trabalho extenso, ele acaba esquecendo se os números são positivos ou negativos.

Faça um programa que ajude Alberto a saber se os valores que ele está digitando são positivos ou negativos.*/

import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int numero = keyboard.nextInt();
	if (numero>0){
	    System.out.println("POS");
	} else {
	    if (numero==0){
	        System.out.println("ZERO");
	    } else {
	        System.out.println("NEG");
	    }
	}
	
	
	keyboard.close();
	}
}
