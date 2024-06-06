package Figuras;

public class Figura_2D extends Figuras_Geometricas{
    public double area;
    public double perimetro;
    public Figura_2D(int NLados,String nombre, double area, double perimetro){
        super(NLados,nombre);
        this.area=area;
        this.perimetro=perimetro;
    }
    @Override
        public void mostrarInf(){   
        super.mostrarInf();
        System.out.println("-Area: "+area+"\n-Perímetrto: "+perimetro);
    }
}
