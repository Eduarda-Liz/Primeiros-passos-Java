/*Uma corrida de kart está acontecendo na cidade de Júlio e o critério para a vitória desta corrida não envolve apenas chegar até a linha de chegada,
também é necessário conseguir uma pontuação boa para se tornar o vencedor. Essa pontuação é baseada em manobras, ultrapassagens, curvas fechadas, etc. 
Seu trabalho é verificar quantos competidores ficaram com a pontuação positiva, isto é, maior ou igual a zero.

Números inteiros N (-999<=N<=999) referente a pontuação de cada jogador.
O programa deve parar quando a pontuação de um jogador for negativa.

Saída

O número de competidores com pontuação maior ou igual a zero.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int valor = keyboard.nextInt();
    int contador = 0;
        while (valor>=0) {
            contador++;  
            valor = keyboard.nextInt();
        }

        System.out.println(contador);
        
        keyboard.close();
    }
}
