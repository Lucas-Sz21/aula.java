void main() {

    float a = Float.parseFloat(IO.readln("Digite o valor do primeiro número: "));

    float b = Float.parseFloat(IO.readln("Digite o valor do segundo número: "));

    float c = Float.parseFloat(IO.readln("Digite o valor do terceiro número: "));

    IO.println("O quadrado da soma dos três valores digitados é: " + Math.pow(( a + b + c ),2));
}