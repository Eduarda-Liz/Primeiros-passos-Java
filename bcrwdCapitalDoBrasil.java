import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String correto = "Brasília";

        String chance = keyboard.nextLine(); 

        if (chance.equalsIgnoreCase(correto)) {
            System.out.println("CORRECT!");
        } else {
            System.out.println("2 CHANCES.");
            chance = keyboard.nextLine(); 
//NÃO FECHAR O ELSE 
            if (chance.equalsIgnoreCase(correto)) {
                System.out.println("CORRECT!");
            } else {
                System.out.println("1 CHANCE.");
                chance = keyboard.nextLine(); 

                if (chance.equalsIgnoreCase(correto)) {
                    System.out.println("CORRECT!");
                } else {
                    System.out.println("END OF PROGRAM.");
                }
            }
        }

        keyboard.close();
    }
}
