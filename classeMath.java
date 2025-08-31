//CLASSE MATH.
//ALGUNS USOS MAIS COMUNS
public class Main
{
	public static void main(String[] args) {
	
	double n1 = 9;
    int n2 = 90;
    double n3 = -50;	
	
	int min = Math.min(15,5);//Math.min mostra o valor minimo. No parentesis pode ser variaveis	
	double max = Math.max(n1, n2);//Assim como o min(minimo), tem o max(maximo). 
	//Em double pois pode armazenar valores flutuantes tambem.
	double raiz = Math.sqrt(n1);//raiz quadrada, sempre espera um double.
	double absoluto = Math.abs(n3);//recebe double e entrega double, essa dia o valor aboluto (positivo)
	double aleatorio = Math.random()*11;//não recebe parametros, retorna um numero entre 0 e 1, aleatoriamente.
	//se eu quiser que seja um numero maior que 0, multiplicar por 10 (numeros entre 0 e 10), etc
    //o 10 não entraria, então precisa colocar o 11, ou 101, etc.
	double aleatorioCasting = (int)(Math.random()*101);// para converter o valor para inteiro, pode ser feito um casting
	double potencia = Math.pow(5,2);//o segundo numero é a potencia.5^2
	double floor = Math.floor(aleatorio);//retorna o valor inteiro mais próximo
	double arredondar = Math.round(aleatorio);//retorna o arredondamento
	
	
	System.out.println(min);
	System.out.println(max);
	System.out.println(raiz);
	System.out.println(absoluto);
	System.out.println(aleatorio);
	System.out.println(aleatorioCasting);
	System.out.println(potencia);
	System.out.println(floor);
	System.out.println(arredondar);
	}
}
