import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String regiao = keyboard.next();
    int tipo = keyboard.nextInt();

        switch (tipo) {
            case 0:
                if (regiao.equals("N")) {
                    System.out.println("500.00");
                }
                if (regiao.equals("NE") || regiao.equals("W")) {
                    System.out.println("350.00");
                }
                if (regiao.equals("S")) {
                    System.out.println("300.00");
                }
                break;

            case 1:
                if (regiao.equals("N")) {
                    System.out.println("900.00");
                }
                if (regiao.equals("NE")) {
                    System.out.println("650.00");
                }
                if (regiao.equals("W")){
                     System.out.println("600.00");
                }
                if (regiao.equals("S")) {
                    System.out.println("550.00");
                }
                break;
                
        }
   



    keyboard.close();
    }
}
