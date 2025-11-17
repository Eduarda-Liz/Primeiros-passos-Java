/*No jogo What are the Odds uma série de números começa a aparecer na tela e você precisa apertar no botão ‘Repeat’ toda vez que aparecer um número ímpar. Ao final é mostrado todos os números que passaram pela tela, sendo os ímpares repetidos.

Faça um programa que mostre o final do jogo de uma série decrescente entre 50 e 5.

Saída

Cinquenta linhas com um número inteiro em cada, ou dois, caso ele for ímpar.

OBS: Tente resolver o problema usando estruturas de repetição para melhor aprendizado.*/
import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int cont = 50;
        for (int i=50; i>=5; i--) {
            if (cont%2==0) {
                System.out.println(cont);
            } else {
                System.out.print(cont + " ");
                System.out.println(cont);
            }
            cont --;
        }
        keyboard.close();
    }
}
