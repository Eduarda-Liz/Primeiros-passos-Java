/*A turma de Paulo está em um passeio em um parque muito famoso de sua região. Este parque é enorme e, pensando nisso,
seus professores pensaram em fazer um desafio para a turma. Eles esconderam diversas cartas por todo o parque e, 
dependendo de quantas cartas um aluno conseguir, ele ganha um prêmio. Seu trabalho é identificar quantos alunos acharam entre 100 e 200 cartas.

Entrada

Devem ser digitados números inteiros N (0<=N<=1000) que serão as cartas de cada aluno. A entrada para quando o valor de N for zero.

Saída

O número de alunos que conseguiram achar entre 100 (inclusive) e 200 (inclusive) cartas.*/

import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int valor = keyboard.nextInt();
    int contador = 0;
        while (valor != 0) {
            if (valor>=100 && valor<=200) {
              contador++;  
            }
            valor = keyboard.nextInt();
        }

        System.out.println(contador);
        
        keyboard.close();
    }
}
