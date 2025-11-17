/* Exercício 5: Listagem de Produtos
Crie e declare um array chamado produtos que guarde 5 nomes de itens do tipo String.

Inicialize o array com cinco nomes de produtos à sua escolha.

Use o laço de repetição for-each (ou enhanced for loop) para percorrer o array.

Dentro do laço, imprima cada nome de produto em uma linha separada.

Pode enviar o código quando terminar!.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    String[] produtos = {"batata", "beterraba", "mamao", "limao", "cenoura"};
        for (String nome : produtos) {
            System.out.println(nome);
        }
    }
}
