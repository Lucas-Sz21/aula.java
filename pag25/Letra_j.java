void main() {
    float cotacaoUsd = Float.parseFloat(IO.readln(" Informe a cotação do dólar hoje: "));

    float valorUsd = Float.parseFloat(IO.readln(" Digite a quantidade em USD para conversão em BRL: "));

    IO.println(" A conversão de " + valorUsd + " USD para BRL é: " + valorUsd * cotacaoUsd + " BRL");
}