void main() {

    float comprimento = Float.parseFloat(IO.readln("Digite o comprimento da caixa retangular em cm: "));

    float largura = Float.parseFloat(IO.readln("Digite a largura da caixa retangular em cm: "));

    float altura = Float.parseFloat(IO.readln("Digite a altura da caixa retangular em cm: "));

    float volume = comprimento * largura * altura;

    IO.println("O volume da caixa retangular dadas as dimensões fornecidas é de: " + volume + "cm3");
}
