//DIVISÃO INTEIROS

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int eleitores = keyboard.nextInt();
    int brancos = keyboard.nextInt();
    int nulos = keyboard.nextInt();
    int validos = keyboard.nextInt();
    int totalVotos = validos + brancos + nulos; //em java, quando divide um inteiro por outro inteiro, o resultado sai como inteiro
    double percentualBrancos = ((double)brancos * 100.0)/totalVotos; //Casting é quando força a conversão de um inteiro para flutuante
    double percentualNulos = ((double)nulos * 100.0)/totalVotos; //o .0 no final do numero garante que seja interpretado como double.
    double percentualValidos = ((double)validos * 100.0)/totalVotos; // esse calculo é regra de três. Soma todos os votantes, os eleitores não é relevante p conta
    System.out.printf("%.1f (percentual de votos brancos)\n" , percentualBrancos );
    System.out.printf("%.1f (percentual de votos nulos)\n" , percentualNulos);
    System.out.printf("%.1f (percentual de votos válidos)\n" , percentualValidos);
    
    keyboard.close();
    }
}
