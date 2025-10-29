import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String nome = keyboard.nextLine();
    double valor = keyboard.nextDouble();
    double calculo;

    System.out.println(nome);

        if (valor<10) {
            System.out.printf("%.2f\n" , valor*1.7);
        }

        if (valor>=10 && valor<30) {
            System.out.printf("%.2f\n" , valor*1.5);
        }

        if (valor>=30 && valor<50) {
            System.out.printf("%.2f\n" , valor*1.4);
        }

        if (valor>=50) {
            System.out.printf("%.2f\n" , valor*1.3);
        }

    keyboard.close();
    }
}
