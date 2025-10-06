/*Um dos maiores sonhos da vida de Amanda é ter uma festa de quinze anos, e esse sonho está prestes a se realizar. 
Faltando apenas 6 meses para seu aniversário, ela, juntamente com seus pais, está decidindo os últimos detalhes antes de enviar os convites.
Sua mãe decidiu que cada mesa terá 11 pessoas, mas, dependendo da quantidade de convidados, alguma mesa precisará de mais ou menos lugares.
Faça um algoritmo que mostre se, com a quantidade de pessoas que Amanda irá convidar, todas as mesas poderão ser de 11 lugares, ou se elas terão que fazer*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int convidados = keyboard.nextInt();
    
    if(convidados%11==0){
      System.out.println("OK");
    } else {
      System.out.println("NO");
    }
    
  
    keyboard.close();
  }
}
