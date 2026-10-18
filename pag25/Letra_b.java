void main() {

    float fahrenheit = Float.parseFloat(IO.readln("Informe uma temperatura em graus fahrenheit: "));

    float celsius = ( fahrenheit - 32 ) * ( (float)5 / 9 );

    IO.println(fahrenheit + "°F equivalem a " + celsius + "°C");
}