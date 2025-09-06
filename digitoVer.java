
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numero = keyboard.nextInt(); //vou considerar 235
   
//CALCULO 235 + 532 = 767:
    double centenaNum = numero/100;//retorna 2
    double centenaNumDez = ((int)centenaNum*10);// retorna 20
    double dezena = (numero/10) - centenaNumDez; //retorna 3
    double unidadeCalculo1 = centenaNumDez*10; // retorna 200
    double unidadeCalculo2 = dezena*10; // retorna 30
    double unidade = numero - unidadeCalculo1 - unidadeCalculo2; // retorna 5
   
    double numInversoCalculo  = ( (unidade*100) + (dezena*10) + centenaNum) + numero; // 235 + 532 = 767
   
//CALCULO (7 * 1) + (6 * 2) + (7 * 3) = 40
    //ISOLANDO OS NUMEROS:
    double centenaInverso = (int)numInversoCalculo/100;//retorna 7
    double centenaInversoDez = ((int)centenaInverso*10);// retorna 70
    double dezenaInverso = ((int)numInversoCalculo/10) - centenaInversoDez; //retorna 6
    double unidadeCalculoInverso1 = centenaInversoDez*10; // retorna 700
    double unidadeCalculoInverso2 = dezenaInverso*10; // retorna 30
    double unidadeInverso = numInversoCalculo - unidadeCalculoInverso1 - unidadeCalculoInverso2; // retorna 7
    //CALCULANDO (7 * 1) + (6 * 2) + (7 * 3) = 40
    double calculoFinal = (centenaInverso * 1) + (dezenaInverso * 2) + (unidadeInverso * 3); // retorna 40
    
//CALCULANDO DIGITO VERIFICADOR (ULTIMO NUMERO)    
    double digitoVerCalculo = (calculoFinal*0.10);
    int digito = (int) calculoFinal - ((int)digitoVerCalculo*10); 
   
    System.out.println(digito);
    keyboard.close();
    }
}