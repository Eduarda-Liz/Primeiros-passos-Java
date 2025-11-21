/*Exercício 10: Modificação de Elemento e Laço Aninhado Básico
Crie e declare uma matriz de String chamada tabuleiro de 3x3.

Instancie-a com o tamanho, mas sem preencher (new String[3][3];).

Modifique o elemento da posição Linha 0, Coluna 0 para "X".

Use laços aninhados (for tradicional) para preencher todos os demais elementos com o caractere "_".

Use laços aninhados novamente para imprimir a matriz em formato de tabela.*/
import java.util.*;


class Main {
    public static void main(String[] args) {
    String[][] tabuleiro = new String[3][3];
        for (int l=0; l<tabuleiro.length; l++) {
            for (int c=0; c<tabuleiro[l].length; c++) {
                  tabuleiro[l][c]  = "_ ";         
            }
        }
    tabuleiro [0][0] = "X ";
        for (int l=0; l<tabuleiro.length; l++) {
            for (int c=0; c<tabuleiro[l].length; c++) {
                System.out.print(tabuleiro[l][c]);
            }
        System.out.println();
        }
    }
}
