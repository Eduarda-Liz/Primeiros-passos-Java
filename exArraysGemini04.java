/*Exercício 4: Cálculo Simples de Projeção (Modificação Pós-Inicialização)
Crie e declare um array chamado producaoTrimestral de tipo inteiro (int) e o inicialize de forma 
imediata com os seguintes valores: {100, 150, 180}.Devido a uma manutenção, a produção de todos os meses 
foi subestimada em 10%. Use um laço de repetição for para percorrer o array.Dentro do loop, modifique o 
valor de cada posição do array, adicionando 10% ao valor original.

Dica: Novo Valor = Valor Original + (Valor Original $\times$ 0.10)
Após o loop, imprima o valor da nova produção do segundo mês (índice 1).

Atenção: Como a produção é de tipo int e o cálculo de 10% envolve decimais, você terá que usar 
o tipo double para o cálculo e depois converter de volta para int, 
ou considerar o array como double[] desde o início para simplificar. 

Sugiro usar double[] para evitar problemas de arredondamento.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    double[] producaoTrimestral = {100, 150, 180};
        for (int i=0; i<producaoTrimestral.length; i++) {
            producaoTrimestral[i] = producaoTrimestral[i]*1.1;
        }
    System.out.println(producaoTrimestral[1]);
    }
}
