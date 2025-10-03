/*No restaurante de Carlos, todo mês ele faz uma promoção diferente de acordo com a idade de seus clientes. A deste mês funciona da seguinte maneira:

 clientes entre 10 e 20 anos recebem 10% de desconto;

clientes entre 21 e 30 anos recebem 5% de desconto;

clientes a partir de 90 anos recebem 20% de desconto;*/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int idade = keyboard.nextInt();
	if (idade>=10 && idade<=20){
	    System.out.println("10%");
	} else {
	    if (idade>20 && idade <=30){
	        System.out.println("5%");
	    } else {
	        if (idade>=90){
	            System.out.println("20%");
	        }
	    }
	}
	
	
	keyboard.close();
	}
}
