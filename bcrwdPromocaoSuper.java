/*No supermercado perto de sua casa, as maçãs estão em promoção! 
Se forem compradas em quantidade menor que uma dúzia, custam R$0,80 cada, e, 
se forem compradas em quantidade maior ou igual a uma dúzia, custam R$0,50 cada! 
Faça um algoritmo para o dono do supermercado implementar nos caixas: ele deve ler 
a quantidade de maçãs que estão sendo compradas, 
calcular o valor total da compra e mostrá-lo na tela, com duas casas decimais.*/

import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int macas = keyboard.nextInt();
    double valor;

        if (macas<12) {
            valor = (double)macas * 0.80;
            System.out.printf("%.2f\n" , valor);
        } else {
            valor = (double)macas * 0.50;
            System.out.printf("%.2f\n" , valor);
        }
        
    }
}
