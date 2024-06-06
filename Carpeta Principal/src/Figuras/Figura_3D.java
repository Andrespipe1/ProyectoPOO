package Figuras;

public class Figura_3D extends Figuras_Geometricas{
    public int nCaras;
    public double arista;
    public Figura_3D(int NLados,String nombre, int nCaras, double arista){
        super(NLados,nombre);
        this.nCaras=nCaras;
        this.arista=arista;
    }
    @Override
    public void mostrarInf(){
        System.out.println("-Numero de caras: "+nCaras+"\n-Aristas: "+arista);
    }
}