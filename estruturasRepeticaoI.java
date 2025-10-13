/*São comandos que permitem repetir uma ação várias vezes, sem precisar escrever o mesmo código várias vezes.*/

for (inicialização; condição; atualização) {
    // bloco de código
}
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i); //exemplo
}

/*O que acontece:

Começa com i = 0.

Executa o bloco se i < 5 for verdadeiro.

Depois aumenta i em 1.

Repete até i ser 5.*/

//Usado muito para percorrer arrays:
int[] numeros = {2, 4, 6};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
