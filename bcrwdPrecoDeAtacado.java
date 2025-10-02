/*Com a pandemia do COVID-19, a loja X acabou tendo que fechar as portas.
Porém, antes de fechar oficialmente, o dono decidiu colocar uma promoção de atacado. 
A partir de 20 volumes, o produto sai por 50% do valor original.

Faça um programa para verificar a quantidade de cada produto comprado pelo consumidor e informar se ele entrará na promoção ou não.*/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int quantidade = keyboard.nextInt();
	    if (quantidade>=20){
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
	    }
	
	keyboard.close();
	}
}
