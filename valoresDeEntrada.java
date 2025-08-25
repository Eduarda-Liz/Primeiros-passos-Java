
import java.util.Scanner; //Importar teclado, também pode usar java.util.*

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); // Declaracao do teclado
	    
	    System.out.println("Olá, qual seu nome? Digite seu nome e de enter");
	    String nomeDoUsuario = teclado.nextLine(); //nextLine para frases (com espaco)
	    //cada teclado.next-var-() refere-se ao tipo de variavel, exemplo: teclado.nextInt
		System.out.println("Boas vindas " + nomeDoUsuario);
		teclado.close(); //lembrar de fechar o teclado
		
	}
}
