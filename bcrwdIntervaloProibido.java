import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int x = keyboard.nextInt();
    double calculo;

        if (x>=-4 && x<=4) {
            System.out.println("prohibited interval");
        } else if (-100 <= x && x <= 100) {
            calculo = (5*x+3) / Math.sqrt((Math.pow(x, 2) -16));
            System.out.printf("%.3f\n" , calculo);
        }
    
    
    keyboard.close();
    }
}
