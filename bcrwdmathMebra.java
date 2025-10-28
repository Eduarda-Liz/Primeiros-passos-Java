import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x = keyboard.nextDouble();
    double calculo;

        if (x<=1) {
            System.out.println("1.0");
        }
        if (x>1 && x<=2){
           System.out.println("2.0"); 
        }
        if (x>2 && x<=3){
            calculo = Math.pow(x, 2);
            System.out.printf("%.1f\n" , calculo); 
        }
        if (x>3){
            calculo = Math.pow(x, 3);
            System.out.printf("%.1f\n" , calculo); 
        }
    
    keyboard.close();
    }
}
