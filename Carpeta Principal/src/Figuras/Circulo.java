package Figuras;

class Circulo extends Otros {
    public double radio;

    // Constructor
    public Circulo(int NLados, String nombre,double area,double perimetro, String tipo,  double apotema,double largolado,double radio) {
        super( NLados, nombre, area, perimetro, tipo,apotema,largolado);
        this.radio = radio;
    }

    @Override
    public double calcular_perimetro(){
        return radio*(2*3.1416);

    }

    @Override
    public double calcular_area(){
        return (3.1416*radio)*(3.1416*radio);

    }

    @Override
    public void mostrarInf(){
        System.out.println("El area del "+nombre+" es de: "+calcular_area());
        System.out.println("El perimetro del "+nombre+" es de: "+calcular_perimetro());
        System.out.println("El radio es de: "+radio);
    }

}
