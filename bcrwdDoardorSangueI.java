/* O mundo está carente de solidariedade, e poucos atos são mais generosos do que doar sangue para salvar a vida de quem precisa.
Porém, para realizar uma doação de sangue, existem alguns pré-requisitos.
É necessário que o doador tenha entre 16 e 69 anos (inclusive).
Para ajudar na campanha de doação de sangue de sua cidade, faça um programa que auxilie na validação dos requisitos para se tornar um doador de sangue.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int idade = keyboard.nextInt();
	    if (idade>=16 && idade<=69) {
	        System.out.println("YES"); 
	          } else {
	System.out.println("NO");}
	}
}
