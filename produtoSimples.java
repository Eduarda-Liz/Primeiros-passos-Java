import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	int a = keyboard.nextInt();
	int b = keyboard.nextInt();
	int calculo = a*b;
	
	System.out.println("PROD = " + calculo);
	keyboard.close();
	}
}
