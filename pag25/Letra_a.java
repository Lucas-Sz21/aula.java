void main() {

    float celsius = Float.parseFloat(IO.readln("Informe uma temperatura em graus celsius: "));
    
    float fahrenheit = ( 9 * celsius + 160 ) / 5;

    IO.println(celsius + "°C equivalem a " + fahrenheit + "°F");
}