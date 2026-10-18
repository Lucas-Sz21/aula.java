void main() {

    float a = Float.parseFloat(IO.readln("Digite o valor do primeiro número: "));

    float b = Float.parseFloat(IO.readln("Digite o valor do segundo número: "));

    float c = Float.parseFloat(IO.readln("Digite o valor do terceiro número: "));

    IO.println("A soma dos quadrados dos valores digitados é de: " + (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c,2)));

}