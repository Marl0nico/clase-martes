public class Cuadrado {
    double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    private double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    //métodos personalizados
    public void perímetro(){
        System.out.println("El lado es: "+this.getLado());
        System.out.println("El perímetro es: "+this.getLado()*4);
    }
    public void área(){
        System.out.println("El lado es: "+this.getLado());
        System.out.println("El área es: "+this.getLado()*this.getLado());
    }
    public void diagonal(){
        System.out.println("El lado es: "+this.getLado());
        System.out.println("La diagonal es: "+Math.sqrt(2)*this.getLado());
    }
}
