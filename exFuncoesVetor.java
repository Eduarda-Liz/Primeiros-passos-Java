/*1) Soma dos elementos de um vetor

Crie uma função que receba um vetor de números inteiros e retorne a soma de todos os seus elementos.
Exemplo:
Entrada: [3, 5, 2] → Saída: 10.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 6};
        System.out.println(vetor(numeros));
    }
    public static int vetor(int[] numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }
}
