/*Math.abs()

Essa função faz aparecer o número abosuluto. Ou seja, a distância daquele número ao 0.
Por exemplo, Math.abs(-10) retorna 10*/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int pontoA = keyboard.nextInt();
	int pontoB = keyboard.nextInt();
	
	int distancia = Math.abs(pontoB - pontoA);//aqui pode ser feito o calculo dentro da função
	// vai retornar o valor absoluto. Independende de qual valor é maior ou menor.
	System.out.println(distancia);
	}
}
