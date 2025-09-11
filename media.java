import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	double a = keyboard.nextDouble();
	double b = keyboard.nextDouble();
	double mediaPonderada = ((a*3.5)+(b*7.5))/11;
	
	System.out.printf("MEDIA = %.5f\n" , mediaPonderada);
	keyboard.close();
	}
}
