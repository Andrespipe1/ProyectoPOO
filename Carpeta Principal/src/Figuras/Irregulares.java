package Figuras;

public class Irregulares extends Figura_2D {

    public String tipo;

    // Constructor
    public Irregulares(int NLados,String nombre,double area, double perimetro, String tipo) {
        super(NLados,nombre,area, perimetro);
        this.tipo = tipo;
    }
  
    @Override
    public void mostrarInf() {
        System.out.println("\n"+"Tipo: " + tipo);
    }
}
