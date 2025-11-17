/*
📝 Exercício Prático: Estatística de Alunos
O Desafio
Você precisa criar um programa que armazene as notas de 4 alunos em um teste e, 
em seguida, calcule a média dessas notas.

Crie e declare um array chamado notas que possa guardar 4 valores do tipo double.

Inicialize o array atribuindo as seguintes notas a cada posição:

Aluno 1 (índice 0): 7.5
Aluno 2 (índice 1): 9.0
Aluno 3 (índice 2): 6.0
Aluno 4 (índice 3): 8.5

Crie uma variável soma (do tipo double) e use um laço de repetição for para percorrer o array, 
somando todos os valores do array notas e guardando o resultado em soma.
Calcule a média dividindo a soma pelo tamanho do array, que você deve obter usando o atributo .length.
Imprima na tela a nota do Aluno 3 e a Média Geral da turma.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    double[] notas = {7.5, 9.0, 6.0, 8.5};
    double soma = 0;
   
        for (int i = 0; i<notas.length; i++){
            soma += notas[i];
        }
        
    int tamanho = notas.length;
    double mediaTurma = soma/tamanho;
    System.out.println(notas[2]);
    System.out.println(mediaTurma);
    }
}
