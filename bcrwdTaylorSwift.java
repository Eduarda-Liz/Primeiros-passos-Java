/* A cantora norte-americana Taylor Swift está gravando e 
lançando novamente seus álbuns antigos, incluindo na tracklist 
algumas músicas inéditas, chamadas de “From the Vault Tracks”. 
Para seu próximo relançamento, ela ainda precisa escolher as músicas inéditas, 
e tem uma lista com várias opções. Ela decidiu que, para esse álbum, 
ela irá lançar as músicas inéditas que estejam em índices pares em sua lista. 
Para ajudá-la a filtrar essas músicas, você foi contratado para criar 
um algoritmo que, após ler um número inteiro N, imprime na tela todos 
os números pares de 1 a N, e, no final, mostra a soma dos números impressos, 
que será usada pela própria Taylor para deixar easter eggs para seus
fãs no álbum.

Entrada

Um número inteiro N (2 < N < 1000),
representando a quantidade de músicas “From the Vault” da lista de Taylor.

Saída

Todos os números pares no intervalo [1,N], inclusive N caso esse seja par, 
seguidos pela soma dos mesmos.*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num = keyboard.nextInt();
	int calculo=2;
	int soma = 0;
	
	do  {  	System.out.println(calculo);
	     	soma = calculo + soma;
	        calculo = calculo + 2;
	        
	} while (calculo<=num);
	
	System.out.println(soma);
	
	}
}
