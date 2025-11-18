/*Exercício 7: Soma e Média Ponderada (Uso de for Tradicional)
Crie e declare um array de double chamado pesos e o inicialize com 4 valores: {0.2, 0.3, 0.4, 0.1}.

Crie e declare outro array de double chamado notas e o inicialize com 4 notas: {8.0, 7.5, 9.0, 6.0}.

Crie uma variável somaPonderada (tipo double) inicializada em 0.

Use o laço for tradicional (com índice i) para:

Percorrer os arrays.

Somar o produto de cada nota pelo seu respectivo peso: somaPonderada += notas[i] * pesos[i];

Imprima o valor final de somaPonderada.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    double[] pesos = {0.2, 0.3, 0.4, 0.1};
    double[] notas = {8.0, 7.5, 9.0, 6.0};
    double somaPonderada = 0; 
        for (int i=0; i<pesos.length; i++) {
            somaPonderada += notas[i] * pesos[i];
        }
    System.out.println(somaPonderada); 
    }
}
