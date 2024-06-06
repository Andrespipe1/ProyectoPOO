package Figuras;

public class Figuras_Geometricas {
    public int NLados;
    public String nombre;
    public Figuras_Geometricas(int NLados, String nombre){
        this.NLados=NLados;
        this.nombre=nombre;
    }
    public void mostrarDatos(){
        System.out.println("---Figura---\nNombre: "+nombre+"\nNLados: "+NLados);
    }
}

