import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int idade = keyboard.nextInt();

        if (idade>21) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        keyboard.close();
    }
}
