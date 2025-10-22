import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double nota1 = keyboard.nextDouble();
    double nota2 = keyboard.nextDouble();
    double nota3 = keyboard.nextDouble();
    double media = (nota1 + nota2 + nota3)/3;

        if (media<6) {
            System.out.println("FAILED");
        } else if (media>=6 && media<=6.9) {
            System.out.println("RETAKE");
        } else if (media>=7 && media <=8) {
            System.out.println("APPROVED, BUT YOU CAN DO BETTER");
        } else if (media>=8.1 && media <=9.7) {
            System.out.println("APPROVED");
        } else {
            System.out.println("APPROVED, CONGRATULATIONS");
        }
    
    }
}
