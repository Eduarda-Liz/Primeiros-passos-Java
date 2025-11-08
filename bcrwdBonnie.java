/*A cadelinha de Marcelo, Bonnie, acabou de ter vários filhotinhos, porém Marcelo não possui condições de criar todos eles e vai dar para adoção. 
Seu trabalho é contar quantos dos filhotes são fêmeas e quantos são machos.
Entrada
Um número inteiro N (0<N<100) que será o número de casos de teste e, a seguir, N Strings contendo "M" para macho e "F" para fêmea.
Saída
Imprima, respectivamente, o número de filhotes machos e o número de filhotes fêmeas.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int filhotes = keyboard.nextInt();
    String gen;
    int f = 0;
    int m = 0;
    
        for (int i=0; i<filhotes; i++) {
            gen = keyboard.next();
            if (gen.equalsIgnoreCase("F")) {
                f++;
            } else {
                m++;
            }
        }

       System.out.println(m);
       System.out.println(f);
        
    keyboard.close();
    }
}
