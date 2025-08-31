// CONDICIONAL MULTIPLA ESCOLHA

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Insira o número de pernas: ");
	int pernas = keyboard.nextInt();
	System.out.print("Isso é um: ");
	String tipo;
	
	switch(pernas){ //switch indica a condicinal de multipla escolha, pernas é a variavel
	    case 1: 
	        tipo = "Saci"; // "tipo" é a variavel, que está em string
	        break; // aqui é para "parar", tem que ter em todo caso, exceto default
	    case 2: 
	        tipo = "Bípede";
	        break;
	    case 4: 
	        tipo = "Quadrupede";
	        break;
	    case 6, 8: // os numeros indicam o numero inteiro da variavel pernas
	        tipo = "Aranha";
	        break;
	    default: //default é a última, caso nenhum dos numeros acima seja adicionado.
	    //default não precisa do break, mas pode colocar se quiser.
	        tipo = "ET";
	}
	  System.out.println(tipo);  
	keyboard.close();
} }

// O SWITCH NÃO FUNCIONA PARA INTERVALOS E NEM NUMEROS REAIS.
