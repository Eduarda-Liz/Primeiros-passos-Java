/*Aproveitando que a prefeitura de Porto Alegre abriu uma linha de crédito para os funcionários estatutários, 
Manoel pensou que esse era o momento perfeito para comprar seu tão sonhado carro. 
O valor máximo da prestação não pode ultrapassar 30% de seu salário bruto e Manoel quer saber se ele irá conseguir pagar pelo carro novo.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double vlr1 = keyboard.nextDouble();
    double vlr2 = keyboard.nextDouble();
    double vlr3 = keyboard.nextDouble();
    int negativo = 0;
    if (vlr1<0) {
      negativo = negativo + 1;
    }
    if (vlr2<0) {
      negativo = negativo + 1;
    }
    if (vlr3<0) {
      negativo = negativo + 1;
    }
    
    System.out.println(negativo);
    
    keyboard.close();
  }
}
