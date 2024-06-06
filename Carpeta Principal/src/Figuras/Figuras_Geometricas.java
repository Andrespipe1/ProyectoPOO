package Figuras;

public class Figuras_Geometricas {
    public int NLados;
    public String nombre;
    public Figuras_Geometricas(int NLados, String nombre){
        this.NLados=NLados;
        this.nombre=nombre;
    }
    public void mostrarInf(){
        System.out.println("---Figura---\n-Nombre: "+nombre+"\n-NLados: "+NLados);
    }
}

