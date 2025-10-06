/*Gabriel está ajudando seu irmão mais novo, Lucas, a estudar matemática, fazendo várias perguntas para testar os conhecimentos dele. 
Neste momento os dois estão revisando potenciação e radiciação por meio de um pequeno teste. 
Gabriel diz um número e Lucas precisa dizer a raiz quadrada dele caso ele seja positivo, e elevar à segunda potência se ele for negativo.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numero = keyboard.nextInt();
    
    if (numero>0) {
      System.out.printf("%.2f\n" , Math.sqrt(numero));
    } else {
       System.out.printf("%.2f\n" , Math.pow(numero, 2));
    }
    
    keyboard.close();
  }
}
