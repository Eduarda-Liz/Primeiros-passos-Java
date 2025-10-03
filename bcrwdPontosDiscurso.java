/*Luis é professor de Produção Textual do Ensino Médio e, com a pandemia do Coronavírus, está dando aulas online. Esta semana, ele pediu para seus alunos escreverem um discurso, de no mínimo 20 linhas e no máximo 90 (inclusive), sobre o esporte como ferramenta de inclusão social. Caso o aluno escreva a menos ou a mais que o pedido, ele irá perder 3 pontos.

Crie um progrma que ajude Luis a saber se seus alunos perderão esses 3 pontos ou não.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int linhas = keyboard.nextInt();
    if (linhas>=20 && linhas<=90){
        System.out.println("OK");
    } else {
        System.out.println("3P");
    }
    keyboard.close();
    }
}
