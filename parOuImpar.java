/*OPERADOR DE MODULO: %
O simbolo % é um modulo e representa o resto da divisão.*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Digite um número para descobrir se é par ou ímpar: ");
    int numero = keyboard.nextInt();
        if (numero % 2 == 0) { //o % representa resto da divisão
            System.out.println("Seu número é par!");
        } else { //IF e ELSE será melhor expicado mais pra frente, mas ja sei o que é.
            System.out.println("Seu número é impar!");
     }
  }
}
