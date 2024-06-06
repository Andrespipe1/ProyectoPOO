package Figuras;

public class Otros extends Regulares {
    public double apotema;

    public Otros(int nlados, String nombre,double area,double perimetro, double lado, double apotema){
        super(nlados,nlados,area,perimetro,lado);
        this.apotema = apotema;


    }

    @Override
    public double calcular_perimetro(){
        return lado*nlados;

    }

    @Override
    public double calcular_area(){
        return (perimetro*apotema)/2;

    }

    @Override
    public double mostrar_datos(){
        mostrar_datos();
        System.out.println("El area del "+nombre+" es de: "+calcular_area());
        System.out.println("El perimetro del "+nombre+" es de: "+calcular_perimetro());

    }
