/* Ezra dá aulas de alemão para 20 crianças e não tem tempo de calcular o rendimento de todos os seus alunos, 
porque ele aplicou 5 provas diferentes durante o semestre. Crie um programa que ajude Ezra a fazer os cálculos que ele precisa.
Entrada
Leia 20 linhas de 5 números N cada. Sendo N um valor de ponto flutuante 0 <= N <= 10.
Saída
Imprima a média de cada aluno, a média total da turma e o percentual de alunos que tiveram a média maior ou igual a 5.
Todos os valores devem conter apenas uma casa após a vírgula, de acordo com o exemplo.*/
import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double media;
    double soma = 0;
    int cont = 1;
    int cont2 = 0;
    double aprovados = 0;
    double mediaTurma = 0;
    double percent;

        for (int x = 0; x<20; x++) {
            for (int i=0; i<5; i++) {
                double nota;
                nota = keyboard.nextDouble();
                soma = soma + nota;
            }
        media = soma/5;
        mediaTurma = mediaTurma + media;
        soma = 0;
        System.out.print("Média do aluno " + cont);
        System.out.printf(": %.1f\n", media);
        cont++;
               if (media>=5){
                cont2++;
               }
        }
       
        System.out.printf("Média da turma: %.1f\n" , mediaTurma/20);
        percent = (100*cont2)/20;
        System.out.printf("Alunos com média maior ou igual a 5: %.1f%%\n" , percent);
        
        keyboard.close();
    }
}
