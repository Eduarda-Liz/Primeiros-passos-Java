/* exercicio 6: Crie e declare um array de String chamado frutas e o inicialize com 5 nomes de frutas à sua escolha.

Crie uma variável contagemLongas (tipo int) inicializada em 0.
Use o laço for-each para percorrer o array frutas.
Dentro do laço, use uma condicional (if) para verificar se o tamanho do nome da fruta atual é maior que 6 letras.

Dica: Para obter o tamanho de uma String, use .length() (com parênteses!).
Se a condição for verdadeira, incremente a variável contagemLongas.

Imprima o valor final de contagemLongas.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    String[] frutas = {"abacate" , "banana", "maçã", "pera", "amora"};
    int contagemLongas = 0;
        for (String nome : frutas) {
            if (nome.length()>6) {
                contagemLongas++;
            }
        }
        
    System.out.println(contagemLongas);
    }
}
