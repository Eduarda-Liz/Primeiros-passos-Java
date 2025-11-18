/*Exercício 9: Maior e Menor Valor
Crie e declare um array de int chamado temperaturas e o inicialize com 7 valores de temperatura à sua escolha (ex: {22, 18, 25, 30, 19, 21, 27}).

Crie duas variáveis maiorTemp e menorTemp. Inicialize ambas com o valor do primeiro elemento do array (temperaturas[0]).

Use o laço for-each para percorrer o array temperaturas.

Dentro do laço, use dois blocos condicionais:

if 1: Se a temperatura atual for maior que maiorTemp, atualize o valor de maiorTemp.
if 2: Se a temperatura atual for menor que menorTemp, atualize o valor de menorTemp.

Ao final, imprima o valor de maiorTemp e menorTemp.

Pode me enviar o código quando terminar!
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[] temperatura = {15, 20, 25, 36, 52, 33, 6};
    int maiorTemp = temperatura[0];
    int menorTemp = temperatura[0];
        for (int tempAtual : temperatura) {
            if (tempAtual>maiorTemp) {
                maiorTemp = tempAtual;
            }
            if (tempAtual<menorTemp) {
                menorTemp = tempAtual;
            }
        }
    System.out.println(maiorTemp);
    System.out.println(menorTemp);
    }
}
