public class Rectángulo {
    double base;
    double altura;
    public Rectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void perímetro(){
        System.out.println("La base es: "+this.getBase());
        System.out.println("La altura es: "+this.getAltura());
        System.out.println("El perímetro es: "+((this.getAltura()*2)+(this.getBase()*2)));
    }
    public void área(){
        //System.out.println("La base es: "+this.getBase());
        //System.out.println("La altura es: "+this.getAltura());
        System.out.println("El perímetro es: "+this.getAltura()*this.getBase());
    }
    public void diagonal(){
        //System.out.println("La base es: "+this.getBase());
        //System.out.println("La altura es: "+this.getAltura());
        System.out.println("La diagonal es: "+Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
    }
}
