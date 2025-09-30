/* O mundo está carente de solidariedade, e poucos atos são mais generosos do que doar sangue para salvar a vida de quem precisa.
Porém, para realizar uma doação de sangue, existem alguns pré-requisitos.
É necessário que o doador tenha entre 16 e 69 anos, pesar mais de 50kg, estar em jejum e ter documento com foto. O usuário não pode doar se teve hepatite após os 10 anos e se teve malária.
Para ajudar na campanha de doação de sangue de sua cidade, faça um programa que auxilie na validação dos requisitos para se tornar um doador de sangue. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int idade = keyboard.nextInt();
		double peso = keyboard.nextDouble();
		String jejum = keyboard.next().toUpperCase();
		String doc = keyboard.next().toUpperCase();
		String hepatite = keyboard.next();
		String malaria = keyboard.next();
		
		if (idade>=16 && idade<=69 && peso>50 && jejum.equals("YES") && doc.equals("YES") && hepatite.equalsIgnoreCase("NO") && malaria.equalsIgnoreCase("NO")) {
			System.out.println("YES.");
		} else {
			System.out.println("NO.");
		}
	}
}
