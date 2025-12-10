/*3) Vetor invertido

Crie uma função que receba um vetor e retorne um novo vetor com os elementos na ordem inversa.
Exemplo:
Entrada: [1, 2, 3, 4] → Saída: [4, 3, 2, 1].*/
import java.util.*;

class Main {
    public static void main(String[] args) {
      int[] num = {6, 8, 7, 3};
       inverso(num);
    }
    public static void inverso(int[] num) {
        for (int i=num.length - 1; i>=0; i--) { // sempre que eu iniciar I = NUM.LENGTH eu preciso colocar o "- 1" pois o indice sempre inicia em ZERO, então o valor do indice é sempre um numero menor que o tamanho do vetor
            System.out.print(num[i] + " ");
        }
    }
}
