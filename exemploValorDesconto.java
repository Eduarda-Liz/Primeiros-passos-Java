import java.util.Scanner; //Nao esquecer de fechar com ponto e virgula
//Na aula usamos java.util.* 

public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //Declarar o teclado
		System.out.println("Bem vindo a nossa Loja Virtual!");
		System.out.println("Nossos produtos estao com 9% de desconto!");
		System.out.println("Digite o valor do seu produto para descobrir seu desconto: "); //Cabecalho
		double valorSemDesconto = keyboard.nextDouble(); //A variavel recebe o valor do usuario
		double valorDoDesconto = valorSemDesconto * 0.09; //Calculo para descobrir o desconto
		double valorFinal = valorSemDesconto - valorDoDesconto; //Calculo para descobrir o valor final do produto
		System.out.println("O valor original do seu produto é:  " + valorSemDesconto); //imprime na tela os valores calculados
		System.out.println("o valor final do seu produto, com desconto, será: " + valorFinal);
		System.out.println("Voce ganhou " + valorDoDesconto + " reais de desconto");
		keyboard.close(); //fechar teclado
	//tenho que aprender a fazer aparecer só dois digitos depois da virgula
	}
}
