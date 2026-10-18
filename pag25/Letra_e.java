void main() {
    
    float valorPrestacao = Float.parseFloat(IO.readln("Informe o valor da prestação em R$: "));

    float taxaPrestacao = Float.parseFloat(IO.readln("Informe a taxa de juros (a.m) da prestação: "));

    int tempoPrestacao = Integer.parseInt(IO.readln("Informe o número de meses em atraso: "));

    float Prestacao = valorPrestacao + ( ( valorPrestacao * taxaPrestacao / 100 ) * tempoPrestacao);

    IO.println("O valor da prestação em atraso é de: " + "R$ " + Prestacao + ",00");
}
