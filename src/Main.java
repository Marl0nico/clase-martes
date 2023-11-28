import sun.rmi.transport.proxy.RMIHttpToCGISocketFactory;

import javax.crypto.Cipher;

public class Main {
    public static void main(String[] args) {
        Cuadrado micuadrado=new Cuadrado(8);
        micuadrado.perímetro();
        micuadrado.área();
        micuadrado.diagonal();
        Rectángulo mirectángulo=new Rectángulo(4, 8);
        mirectángulo.perímetro();
        mirectángulo.área();
        mirectángulo.diagonal();
        Círculo micírculo=new Círculo(3.1416, 8);
        micírculo.perímetro();
        micírculo.área();
    }
}