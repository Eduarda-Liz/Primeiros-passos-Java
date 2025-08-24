// ERROS COMUNS - PARA EVITAR
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	// Erro de COMPILAÇÃO: são erros durante a escrita do código
	doube floatNumber = 30.5; //exemplo 1, erro de digitação
	double floatNumber = 50.409 //exemplo 2, sem o ponto e vírgula
	int number = "Hello World"; // exemplo 3, variável não recebe o tipo esperado
	
	//Erro de EXECUÇÃO: Quando o código está correto, mas não é possível executar (exception)
	int num1 = 15;
	int num2 = 0;
	System.out.println(num1 / num2); //exemplo 4, não existe divisão por zero, então não irá funcionar.
	
	}
}
