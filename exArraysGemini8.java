/*Exercício 8: Verificação de Estoque (Booleano e break)
Crie e declare um array de int chamado quantidades e o inicialize com valores que representam o estoque de vários itens: {12, 0, 5, 20, 0, 8}.

Crie uma variável booleana temFalta e a inicialize como false.

Use o laço for-each para percorrer o array quantidades.

Dentro do laço, use uma condicional (if) para verificar se a quantidade atual é igual a 0.

Se a condição for verdadeira, mude o valor de temFalta para true e use o comando break para sair imediatamente do loop.

Imprima o valor final de temFalta.
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[] quantidades = {12, 0, 5, 20, 0, 8};
    boolean temFalta = false;
        for (int itens : quantidades) {
            if (itens==0) {
                temFalta = true;
                break;
            }
        }
        System.out.println(temFalta);
    }
}
