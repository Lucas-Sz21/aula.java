void main() {

    float tempo = Float.parseFloat(IO.readln( " Informe o tempo em horas gasto na viagem: " ));

    float velocidade = Float.parseFloat(IO.readln( " Informe a velocidade média em km/h da viagem: " ));

    float distanciaPercorrida = tempo * velocidade;

    float litrosGastos = distanciaPercorrida / 12;

    IO.println("Tempo de viagem: " + tempo + "h");

    IO.println("Velocidade média: " + velocidade + "km/h");

    IO.println("Distância percorrida: " + distanciaPercorrida + "km");

    IO.println("Litros de combústivel gastos: " + litrosGastos + " l/km");
}