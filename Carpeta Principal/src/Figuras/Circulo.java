package Figuras;

class Circulo extends Otros {
    public double radio;

    // Constructor
    public Circulo(double area, double perimetro, String tipo, String nombre, double radio) {
        super(area, perimetro, tipo, nombre);
        this.radio = radio;
    }

    @Override
    public double calcular_perimetro(){
        return radio*(2*3.1416);

    }

    @Override
    public double calcular_area(){
        return (3.1416*radio)**2;

    }

    @Override
    public double mostrar_datos(){
        mostrar_datos();
        System.out.println("El area del "+nombre+" es de: "+calcular_area());
        System.out.println("El perimetro del "+nombre+" es de: "+calcular_perimetro());

    }

  
    public void imprimirRadio() {
        System.out.println("El radio es de: "+radio);
    }
}
