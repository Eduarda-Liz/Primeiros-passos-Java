import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int anos = keyboard.nextInt();

    if (anos>=5){
        System.out.println("0.95");
    } else if (anos==4) {
        System.out.println("0.90");
    } else if (anos==3) {
        System.out.println("0.85");
    } else if (anos==2) {
        System.out.println("0.75");
    } else {
        System.out.println("0.65");
    }
        
        keyboard.close();
    }
}
