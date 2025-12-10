/*2) Maior elemento do vetor

Escreva uma função que receba um vetor e retorne o maior valor contido nele.
Exemplo:
Entrada: [10, 2, 8, 30] → Saída: 30.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] num = {5, 8, 4, 9};
        System.out.println(maiorValor(num));
    }
    public static int maiorValor(int[] num) {
        int maior = num[0];
            for (int n : num) {
                if (n>maior) {
                    maior = n;
                }
            }
        return maior;
    }
}
