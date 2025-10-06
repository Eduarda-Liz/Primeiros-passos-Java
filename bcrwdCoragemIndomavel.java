/*O Pequeno Nicolau está planejando, junto com seus amigos, 
uma maneira de convencer seus pais a não terem outro filho. Para terem um lugar para realizar suas reuniões, 
os meninos encontraram um esconderijo secreto e estão, agora, construindo uma proteção ao redor, para que ninguém os veja.
Como todos os seus amigos são muito inteligentes, Nicolau decidiu fazer um sistema diferente de senha para entrar no esconderijo. 
A pessoa, para ter permissão de entrar, precisa falar um número que seja divisível por 5. Caso contrário, não poderá se juntar ao resto dos meninos.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int valor = keyboard.nextInt();
    
    if (valor%5==0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
    keyboard.close();
  }
}
