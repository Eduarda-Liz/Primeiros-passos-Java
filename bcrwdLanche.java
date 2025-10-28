import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int cod = keyboard.nextInt();
    int qntd = keyboard.nextInt();

        switch (cod) {
            case 101:
                System.out.println("Hotdog");
                System.out.printf("%.2f\n" , (double)qntd*3.0);
            break;

            case 201:
                System.out.println("Burrito");
                System.out.printf("%.2f\n" , (double)qntd*5.0);
            break;

            case 202:
                System.out.println("Taco");
                System.out.printf("%.2f\n" , (double)qntd*6.0);
            break;

            case 301:
                System.out.println("Hamburger");
                System.out.printf("%.2f\n" , (double)qntd*4.0);
            break;

            case 302:
                System.out.println("Cheeseburger");
                System.out.printf("%.2f\n" , (double)qntd*5.0);
            break;

            case 500:
                System.out.println("Soda");
                System.out.printf("%.2f\n" , (double)qntd*2.0);
            break;
        }
 
    
    keyboard.close();
    }
}
