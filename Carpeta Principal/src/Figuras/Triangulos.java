package Figuras;

public class Triangulo extends Figura_2D{
    public double altura;
    public double base;

    public Triangulo(int nlados, String nombre, double area, double perimetro, double altura, double base){
        super (nlados,nombre,area,perimetro);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public double calcular_area(){
        return (getBase()*getAltura())/2;

    }


    public double calcular_perimetro(){
        return 3*Nlados;

    }


    public void mostrardatos(){
       mostrar_datos();
        System.out.println("El área del "+nombre+" es de: "+ calcular_area()+" \n");
        System.out.println("El perímetro del "+nombre+" es de: " + calcular_perimetro());
    }



}
