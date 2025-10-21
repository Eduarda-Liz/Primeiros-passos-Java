/*Crianças são, naturalmente, muito curiosas. 
Você tem uma prima de 7 anos que está aprendendo os números e está sempre perguntando coisas sobre eles. 
Então, você resolveu fazer um algoritmo onde o usuário digita um número e retorna se esse número é 
igual a 5, a 200, a 400, se está no intervalo entre [500,1000], ou se ele está fora dos critérios 
anteriores, para distraí-la no seu tempo livre.*/

import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num = keyboard.nextInt();

        if (num>=500 && num<=1000) {
            System.out.println("[500,1000]");
        } else if (num==5) {
            System.out.println("=5");
        } else if (num==200){
            System.out.println("=200");
        } else if (num==400) {
            System.out.println("=400");
        } else {
            System.out.println("NONE");
        }
  
       
        
    }
}
