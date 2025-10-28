import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double km = keyboard.nextDouble();
    String tipo = keyboard.next();

        if (tipo.equalsIgnoreCase("sedan")) {
            System.out.printf("%.1fL\n" , km/12);
        }

        if (tipo.equalsIgnoreCase("hatch")) {
            System.out.printf("%.1fL\n" , km/9);
        }

         if (tipo.equalsIgnoreCase("compact")) {
            System.out.printf("%.1fL\n" , km/8);
        }
    


    keyboard.close();
    }
}
