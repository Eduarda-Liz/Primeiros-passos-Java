// CONDICIONAL ENCADEADA

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Calculadora de idade");
	System.out.print("Insira seu ano de nascimento: ");
	int nascimento = keyboard.nextInt();
	int idade = 2025 - nascimento;
	System.out.println("Sua idade é: " + idade + " anos");
	    if (idade<16){
	        System.out.println("Não pode votar!");
	    } else {
	       if ((idade>=16 && idade<18) || (idade>70)) { //&& = e, || = ou;
	           System.out.println("Voto opcional!");//nesse caso, usa outro if e else para continuar.
	       } else {
	           System.out.println("Voto Obrigatório"); //condição encadeada: depende de dois else para funcionar;
	       }//sempre que abrir um if ou else, já fechar.
	    }
	    
	keyboard.close();
} }
