/* Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
	double a = t.nextDouble();
	double b = t.nextDouble();
	double c = t.nextDouble();
	
	double arTri = (a*c)/2;
	double arCir = 3.14159 * (Math.pow(c, 2));
	double arTra = (a+b)*c/2;
	double arQua = Math.pow(b, 2);
	double arRet = a*b;
	
	System.out.printf("TRIANGULO: %.3f\n", arTri);
	System.out.printf("CIRCULO: %.3f\n",arCir);
	System.out.printf("TRAPEZIO: %.3f\n",arTra);
	System.out.printf("QUADRADO: %.3f\n",arQua);
	System.out.printf("RETANGULO: %.3f\n", arRet);
	t.close();
	}
}
