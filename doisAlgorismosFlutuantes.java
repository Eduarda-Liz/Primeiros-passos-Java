import java.util.Scanner; //Nao esquecer de fechar com ponto e virgula
//Na aula usamos java.util.* 

public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //Declarar o teclado
		System.out.println("Bem vindo a nossa Loja Virtual!");
		System.out.println("Nossos produtos estao com 9% de desconto!");
		System.out.println("Digite o valor do seu produto para descobrir seu desconto: "); 
		double valorSemDesconto = keyboard.nextDouble(); 
		double valorDoDesconto = valorSemDesconto * 0.09; 
		double valorFinal = valorSemDesconto - valorDoDesconto; 
		System.out.println("O valor original do seu produto é:  R$" + valorSemDesconto); 
		System.out.printf("o valor final do seu produto, com desconto, será: R$%.2f\n " , valorFinal); // Essa barra ao contrario + n pula uma linha
		//% representa o valor, o .2 representa quantos algarismos apos a virgula vai aparecer, o f representa "float"/
		System.out.printf("Voce ganhou R$%.2f de desconto. \n" , valorDoDesconto); //O System.out.printf so imprime um valor.
		//nao aceita valores separados por virgulas ou concatenados, exemplo: "Algo %.2f " , valor , "mais algo" ou "Algo %.2f" + valor
		keyboard.close(); //fechar teclado
	
	}
}
