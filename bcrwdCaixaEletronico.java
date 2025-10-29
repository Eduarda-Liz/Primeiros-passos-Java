import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double valor = keyboard.nextDouble();
    int quantidade;

        //isolando os núemros
    int reais = (int)valor;
    int centavos = (int)Math.round((valor - reais)*100); //tentei por 10 e deu errado e por 100 deu certo n sei pq

        if (valor==0) {
            System.out.println("none");
        }
        
        if (reais>=100) {
            quantidade = reais/100;
            System.out.println("100 R: " + quantidade);
            reais %= 100; /*esse tipo de escrita pode ser usada para "abreviar" quando refere-se o 
            valor da própria variavel. Por exemplo, variavel++ recebe o valor da varivel +1. reais%=100 
            recebe o resto da divisão da variavel reais por 100, evitando escrever "reais = reais % 100;"*/
          
        }

        if (reais>=50) {
            quantidade = reais/50;
            System.out.println("50 R: " + quantidade);
            reais %= 50;
        }

        if (reais>=20) {
            quantidade = reais/20;
            System.out.println("20 R: " + quantidade);
            reais %= 20;
        }

        if (reais>=10) {
            quantidade = reais/10;
            System.out.println("10 R: " + quantidade);
            reais %= 10;
        }

        if (reais>=5) {
            quantidade = reais/5;
            System.out.println("5 R: " + quantidade);
            reais %= 5;
        }

        if (reais>=2) {
            quantidade = reais/2;
            System.out.println("2 R: " + quantidade);
            reais %= 2;
        }

        if (reais>=1) {
            quantidade = reais/1;
            System.out.println("1 R: " + quantidade);
            reais %= 1;
        }
// Essa primeira parte confere quantas notas é necessário para os reais redondos. Os centavos é feito da mesma forma.

        if (centavos>=50) {
            quantidade = (int)centavos/50;
            System.out.println("50 C: " + quantidade);
            centavos %= 50;
        }

         if (centavos>=25) {
            quantidade = (int)centavos/25;
            System.out.println("25 C: " + quantidade);
            centavos %= 25;
        }

         if (centavos>=10) {
            quantidade = (int)centavos/10;
            System.out.println("10 C: " + quantidade);
            centavos %= 10;
        }

         if (centavos>=5) {
            quantidade = (int)centavos/5;
            System.out.println("5 C: " + quantidade);
            centavos %= 5;
        }

        if (centavos>=1) {
            quantidade = (int)centavos/1;
            System.out.println("1 C: " + quantidade);
        }


// agora eu preciso fazer a resposta caso seja zero
        


    keyboard.close();
    }
}
