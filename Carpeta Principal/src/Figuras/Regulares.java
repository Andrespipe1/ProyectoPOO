package Figuras;
class Regulares extends Figura_2D {
    public String tipo;

    // Constructor
    public Regulares(int NLados,String nombre,double area, double perimetro, String tipo) {
        super(NLados,nombre,area, perimetro);
        this.tipo = tipo;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: " + tipo);
    }
}
