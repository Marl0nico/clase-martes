public class Círculo {
    double pi=3.1416;
    double radio;

    public Círculo(double pi, double radio) {
        this.pi = pi;
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void perímetro(){
        System.out.println("El radio es: "+this.getRadio());
        System.out.println("El perímetro es: "+this.getRadio()*this.getPi()*2);
    }
    public void área(){
        System.out.println("El área es: "+Math.pow(radio, 2)*this.getPi());
    }
}
