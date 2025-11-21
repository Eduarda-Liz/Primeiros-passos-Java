/*Exercício 11: Soma Total de Todos os Elementos
Crie e declare uma matriz de int chamada custos de 3x2.

Inicialize-a com os valores: Linha 0: {50, 60}; Linha 1: {70, 80}; Linha 2: {90, 100}.
Crie uma variável total (int) inicializada em 0.
Use laços aninhados para percorrer a matriz e adicionar cada valor à variável total.
Imprima o valor final de total.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[][] custos = {{50, 60}, {70, 80}, {90, 100}};
    int total = 0;
        for (int l=0; l<custos.length; l++) {
            for (int c=0; c<custos[l].length; c++) {
            total += custos[l][c];
            }
        }
    System.out.println(total);
    }
}
