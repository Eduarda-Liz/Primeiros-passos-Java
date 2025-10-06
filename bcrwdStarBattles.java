/*Na montanha russa STAR BATTLES, há duas opções de carrinho: 

BB9 com fileiras para 9 pessoas 

C5PO com fileiras para 5 pessoas. 

Você e seus amigos chegaram na fila agora e não tem certeza se vocês vão poder ir na montanha russa sem precisar se separar.

Faça um algoritmo que diga em se seu grupo de amigos poderá andar em algum dos carrinhos, sem restar nenhum lugar vago.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int amigos = keyboard.nextInt();
    
    if(amigos%9==0 || amigos%5==0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
  
    keyboard.close();
  }
}
