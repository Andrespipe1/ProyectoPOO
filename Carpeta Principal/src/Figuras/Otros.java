package Figuras;

public class Otros extends Regulares {
    public double apotema;
    public double largolado;

    public Otros(int NLados, String nombre,double area,double perimetro, String tipo, double apotema,double largolado){
        super(NLados, nombre,area,perimetro,tipo);
        this.apotema = apotema;
        this.largolado = largolado;


    }

    public double calcular_perimetro(){
        return largolado*NLados;

    }


    public double calcular_area(){
        return (perimetro*apotema)/2;

    }

    @Override
    public void mostrarInf(){
        super.mostrarInf();
        System.out.println("El area del "+nombre+" es de: "+calcular_area());
        System.out.println("El perimetro del "+nombre+" es de: "+calcular_perimetro());

    }
}
