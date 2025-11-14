/*Para testar seus conhecimentos matemáticos, Felipe está andando pela rua de sua 
cidade e pedindo para que as pessoas digam números aleatórios para que ele possa fazer alguns cálculos. 
Felipe quer saber os seguintes dados:
a) o maior valor 
b) o menor valor 
c) a soma dos valores 
d) a média dos valores 
e) quantos números maiores ou iguais a 20 
f) a porcentagem de valores maiores ou iguais a10 
g) a média dos valores entre 10 (inclusive) e 100 (inclusive)
Seu trabalho é, após ler uma sequência de N números, mostrar os dados que Felipe quer.
Entrada
Um número inteiro N (0<N<100) e N números inteiros X (0<X<1000), que serão os números que Felipe perguntou aos habitantes de sua cidade.
Saída
Deve ser impresso todos os dados que foram descritos na tabela anteriormente 
(itens a), b), c), d), e), f) e g)).
OBS: A média de todos os valores, a porcentagem de valores maiores que 10 e a média de valores 
entre 10 e 100 devem ser impressos com 2 casas decimais.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int numeros;
    int numMaior = 0;
    int numMenor = 1000;
    int soma = 0;
    double media = 0;
    int maiorIgual20 = 0;
    int contadorPercent10 = 0;
    double percentMaiorIgual10 =0;
    double media10e100 = 0;
    int contadorMedia=0;
       
        for (int i = 0; i<n; i++) {
            numeros = keyboard.nextInt();
                if (numeros>numMaior) {
                    numMaior = numeros;
                }
                if (numeros<numMenor) {
                    numMenor = numeros;
                }
            
        soma += numeros; // MANEIRA DE SIMPLIFICAR A LINHA SOMA = SOMA + NUMEROS;
            
                if (numeros>=20) {
                    maiorIgual20++;
                }
                if (numeros>=10) {
                    contadorPercent10++;
                }
                if (numeros<=100 && numeros>=10) {
                    media10e100 = media10e100 + numeros;
                    contadorMedia++;
                }
            
        }
        media = (double)soma/(double)n;
        percentMaiorIgual10 = 100*contadorPercent10/(double)n;
        media10e100 = media10e100/(double)contadorMedia;

        System.out.println(numMaior);
        System.out.println(numMenor);
        System.out.println(soma);
        System.out.printf("%.2f\n" , media);
        System.out.println(maiorIgual20);
        System.out.printf("%.2f%%\n", percentMaiorIgual10);
                if (contadorMedia==0) {
                    System.out.println("0.00");
                } else {
                    System.out.printf("%.2f\n" , media10e100);
                }      
        
        keyboard.close();
    }
}
