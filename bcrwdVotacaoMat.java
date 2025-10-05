/*Prof Marcela vai fazer um dia de cinema com seus alunos na próxima semana, mas eles não conseguem chegar a um consenso de qual filme eles irão assistir. Marcela teve então uma ideia que iria resolver o problema da escolha do filme e ainda revisar a matéria: uma votação matemática!
Os alunos devem se dividir em grupos de três pessoas e cada integrante deve escolher um número. Sendo que, números pares representam o filme 1 e números ímpares, o filme 2.
Depois que os três escolherem seus números, eles devem verificar quantos votos cada filme levou e levar esta escolha até a professora, a partir de uma corrida com obstáculos. Eles irão assistir o filme escolhido pelo grupo que chegar primeiro.
Pedrinho quer a sua ajuda para verificar os números escolhidos pelo seu grupo.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n1 = keyboard.nextInt();
    int n2 = keyboard.nextInt();
    int n3 = keyboard.nextInt();
    int votacao = 0;
    
    if (n1%2==0) {
      votacao = votacao + 1;
    }
    if (n2%2==0){
      votacao = votacao + 1;
    }
     if (n3%2==0){
      votacao = votacao + 1;
    }
    
   if (votacao>=2){
     System.out.println("1");
   } else {
     System.out.println("2");
   }
    
    keyboard.close();
  }
}
