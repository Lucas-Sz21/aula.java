void main () {

    int a = Integer.parseInt(IO.readln("Digite o valor do primeiro número inteiro: "));

    int b = Integer.parseInt(IO.readln("Digite o valor do segundo número inteiro: "));

    IO.println("O quadrado da diferença de " + a + " por " + b + " é igual a: " + Math.pow((a - b), 2));
}
