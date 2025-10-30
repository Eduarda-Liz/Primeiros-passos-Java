import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double salario = keyboard.nextDouble();
    double gasto = keyboard.nextDouble();
    double percentual = (100*gasto)/salario;

    if (percentual<=25){
        System.out.println("Waster");
    } 
    if (percentual>=26 && percentual<=53){
        System.out.println("Spender");
    }
    if (percentual>=54 && percentual<=75){
        System.out.println("Prudent");
    }
    if (percentual>=76){
        System.out.println("Essential");
    }
        keyboard.close();
    }
}
