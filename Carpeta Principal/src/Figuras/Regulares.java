package Figuras;

class Regulares extends Figuras_2D {
    public String tipo;

    // Constructor
    public Regulares(double area, double perimetro, String tipo) {
        super(area, perimetro);
        this.tipo = tipo;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: " + tipo);
    }
}
