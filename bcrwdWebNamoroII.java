/*Jennifer está ficando está desesperada para encontrar seu amor, 
por isso está usando todas as ferramentas que ela pode, como a internet. Porém, ela tem alguns pré-requisitos, 
sendo um deles a idade. Ela gostaria muito que seu parceiro fosse da mesma idade que ela.

Faça um programa que ajude Jennifer a filtrar suas opções de parceiro.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int jenifer = keyboard.nextInt();
    int amor = keyboard.nextInt();
    
    if (jenifer!=amor){
      System.out.println("DIFFERENT");
    }
   
    if (jenifer==amor) {
      System.out.println("SAME");
    }
    
    
   keyboard.close();
  }
}
