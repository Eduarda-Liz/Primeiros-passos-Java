import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bolsa = keyboard.nextDouble();
    int classe = keyboard.nextInt();

    switch (classe) {
            case 1:
            System.out.println("excellent");
            System.out.printf("%.2f\n" , bolsa*2);
            break;

            case 2:
            System.out.println("good");
            System.out.printf("%.2f\n" , bolsa*1.8);
            break;

            case 3:
            System.out.println("average");
            System.out.printf("%.2f\n" , bolsa*1.5);
            break;

            case 4:
            System.out.println("regular");
            System.out.printf("%.2f\n" , bolsa*1.3);
            break;

            case 5:
            System.out.println("you need to practice");
            System.out.printf("%.2f\n" , bolsa*1.1);
            break;

            case 6:
            System.out.println("watch yourself");
            System.out.printf("%.2f\n" , bolsa*1.05);
            break;

            case 7:
            System.out.println("go to the bench");
            System.out.printf("%.2f\n" , bolsa);
            break;
    }
    

    keyboard.close();
    }
}
