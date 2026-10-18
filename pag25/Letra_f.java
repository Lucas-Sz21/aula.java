void main() {
    int valorA = Integer.parseInt(IO.readln("Digite o valor do primeiro número inteiro: "));

    int valorB = Integer.parseInt(IO.readln("Digite o valor do segundo número inteiro: "));

    int valorC = valorA;

    valorA = valorB;

    valorB = valorC;

    IO.println(" o valor de A é: " + valorA + " e o valor de B é: " + valorB);
}