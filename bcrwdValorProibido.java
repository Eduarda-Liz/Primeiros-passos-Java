import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int x = keyboard.nextInt();
    double calculo;

        if (x==2) {
            System.out.println("prohibited value");
        } else {
            calculo =  8/(2-(double)x);
            System.out.printf("%.3f\n" , calculo);
        }

       keyboard.close();
    }
}
