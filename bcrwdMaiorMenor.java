/*Para jogar basquete profissionalmente precisa ser realmente bem alto e Bruno e sua turma estão curiosos em relação à isso. Eles querem medir a altura de todos os N participantes do grupo e descobrir quem é o mais baixo e o mais alto da turma.

Entrada

Um número inteiro N (0<N<100), que será o número de pessoas no grupo, e N pontos flutuantes de dupla precisão X, que serão as alturas, em metros, de cada pessoa do grupo.

Saída

Informe, com duas casas decimais, a altura da pessoa mais baixa e a altura da pessoa mais alta, respectivamente.*/
import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double jogadores = keyboard.nextDouble();
    double altura;
    double maisBaixo = 5000;
    double maisAlto = 0;
        for (int i=0; i<jogadores; i++){
            altura = keyboard.nextDouble();
            
            if (altura>maisAlto) {
                maisAlto = altura;
            }
            if (altura<maisBaixo) {
                maisBaixo = altura;
            }
           
        }
        
        System.out.printf("%.2f\n" , maisBaixo);
        System.out.printf("%.2f\n" , maisAlto);
        
        keyboard.close();
    }
}
