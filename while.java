/*Quando você não sabe quantas vezes vai repetir*/

while (condição) {
    // bloco de código
}

//Exemplo:
int i = 0;
while (i < 5) {
    System.out.println("i vale: " + i);
    i++; // precisa atualizar o contador manualmente!
}

//DO-WHILE

do {
    // bloco de código
} while (condição);

//Exemplo:

int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 3);
