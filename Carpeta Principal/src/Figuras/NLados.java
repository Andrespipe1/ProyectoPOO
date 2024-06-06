package Figuras;

class Nlados extends Otros {
    public int cantidadLados;

    // Constructor
    public Nlados(double area, double perimetro, String tipo, String nombre, int cantidadLados) {
        super(area, perimetro, tipo, nombre);
        this.cantidadLados = cantidadLados;
    }

  
    @Override
    public double mostrar_datos(){
        mostrar_datos();
        System.out.println("La figura tiene: "+cantidadLados);
        
    }

}
