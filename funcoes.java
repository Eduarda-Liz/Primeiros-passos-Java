//FUNÇÃO
/*Função (Bloco de código) que pode ser acessado quando disser "soma"
Nessa função, possui dois tipos de variaveis, de numeros inteiros (x e y). 
O nome não é relevante, o que importa é o tipo*/

public class Main {

	public static void main(String[] args) {
	    soma(10, 15); //argumentos
	    soma(15,20);
	    soma(89, 56);
}
	static void soma(int x, int y) { 
	//static void == declaração padrão 
	// soma == nome da função, conforme achar melhor. 
	//geralmente usa palavras que definem o que a função faz
    // () == parentesis define o que chegará na função
	//(tipo nomeVariavel). Pode ter mais de um, dividido por virgula
	//{} é o bloco de código
		System.out.println(x + y);
	}

}
