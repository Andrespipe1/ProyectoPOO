package Figuras;

class NLados extends Otros {
    public int cantidadLados;

    // Constructor
    public NLados( int NLados, String nombre,double area,double perimetro, String tipo, double apotema,double largolado, int cantidadLados) {
        super( NLados,  nombre, area, perimetro,  tipo,  apotema, largolado);
        this.cantidadLados = cantidadLados;
    }

  
    //@Override
    public void mostrarinf(){
        mostrarinf();
        System.out.println("La figura tiene: "+cantidadLados);
        
    }

}
