import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String nome = keyboard.next();
    int idade = keyboard.nextInt();
    String cat = keyboard.next();

        if (idade>=17 && idade<=70) {
            System.out.println(nome);
            System.out.println(idade);
        
                if (cat.equals("l") && idade>=17 && idade<=20) {
                    System.out.println("1");
                } 
                if (cat.equals("m") && idade>=17 && idade<=20) {
                    System.out.println("2");
                } 
                if (cat.equals("h") && idade>=17 && idade<=20) {
                    System.out.println("3");
                } 
                if (cat.equals("l") && idade>=21 && idade<=24) {
                    System.out.println("2");
                } 
                if (cat.equals("m") && idade>=21 && idade<=24) {
                    System.out.println("3");
                } 
                if (cat.equals("h") && idade>=21 && idade<=24) {
                    System.out.println("4");
                } 
                if (cat.equals("l") && idade>=25 && idade<=34) {
                    System.out.println("3");
                } 
                if (cat.equals("m") && idade>=25 && idade<=34) {
                    System.out.println("4");
                } 
                if (cat.equals("h") && idade>=25 && idade<=34) {
                    System.out.println("5");
                } 
                if (cat.equals("l") && idade>=35 && idade<=64) {
                    System.out.println("4");
                } 
                if (cat.equals("m") && idade>=35 && idade<=64) {
                    System.out.println("5");
                } 
                if (cat.equals("h") && idade>=35 && idade<=64) {
                    System.out.println("6");
                } 
                if (cat.equals("l") && idade>=65 && idade<=70) {
                    System.out.println("7");
                }
                if (cat.equals("m") && idade>=65 && idade<=70) {
                    System.out.println("8");
                }
                if (cat.equals("h") && idade>=65 && idade<=70) {
                    System.out.println("9");
                }
        } else {
            System.out.println("no insurance");
        }

    keyboard.close();
    }
}
