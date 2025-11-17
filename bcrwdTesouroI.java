/*Martin, um lendário caçador de tesouros, está em busca de um cálice de ouro em uma caverna. Porém, para alcançar a sala secreta que este cálice está guardado, ele precisa passar por um desafio que consiste em, após ser informado um número N, dizer os N primeiros números pares a partir de 2. Ajude Martin a conseguir o tesouro.

Entrada

Um número inteiro N (0<N<1000) que será a quantidade de números pares que serão impressor a partir de 2.

Saída

Os N primeiros números pares a partir de 2.*/
import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int contador = 1;
        for (int i=0; i<n; i++){
           System.out.println(contador*2);
           contador++;
        }
        
        
        keyboard.close();
    }
}
