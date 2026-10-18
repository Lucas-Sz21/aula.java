void main() {

    float cotacaoUsd = Float.parseFloat(IO.readln(" Informe a cotação do dólar hoje: "));

    float valorBrl = Float.parseFloat(IO.readln(" Digite a quantidade em BRL para conversão em USD: "));

    IO.println(" A conversão de " + valorBrl + " BRL para USD é: " + (valorBrl / cotacaoUsd) + " USD");
}