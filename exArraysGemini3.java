/* Exercício 3: Cálculo de Ponto de Equilíbrio (Uso de for para preencher)
Este exercício foca em usar o laço de repetição (for) para preencher o array,
em vez de inicializá-lo de forma imediata.
Crie e declare um array chamado ganhosMensais que guarde 6 valores do tipo inteiro (int).
Crie uma variável custoFixo e atribua o valor 500.
Use um laço de repetição for para percorrer o array. 
Dentro do loop, atribua a cada posição (índice) do array o valor de custoFixo + (i * 100), onde i é o contador do laço.

Após o loop, imprima o valor do ganho do terceiro mês (índice 2).
Saída esperada para o terceiro mês (índice 2): $500 + (2 \times 100) = 700$.
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[] ganhosMensais = {1, 2, 3, 4, 5, 6};
    int custoFixo = 500;
            for (int i=0; i<ganhosMensais.length; i++){
                ganhosMensais[i] = i * 100 + custoFixo;
            }
        System.out.println(ganhosMensais[2]);
    }
}
