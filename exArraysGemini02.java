/* O Desafio
Você precisa criar um programa para registrar a quantidade de três tipos de brinquedos em um estoque: 
Carrinhos, Bonecas e Blocos.

Crie e declare um array chamado estoque que possa guardar 3 valores do tipo inteiro (int).

Inicialize o array de forma imediata (na mesma linha da declaração) com as seguintes quantidades:
Carrinhos (índice 0): 45
Bonecas (índice 1): 28
Blocos (índice 2): 62

Acease o valor da posição que guarda a quantidade de Bonecas e modifique este valor, 
adicionando mais 5 Bonecas ao estoque.
Imprima na tela a quantidade inicial de Carrinhos e a quantidade final de Bonecas.
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[] estoque = {45, 28, 62};
    estoque[1] += 5;
    System.out.println(estoque[0]);
    System.out.println(estoque[1]);
    }
}
