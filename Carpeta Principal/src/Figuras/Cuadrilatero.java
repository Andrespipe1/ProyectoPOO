package Figuras;

public class Cuadrilatero extends Figura_2D{
  public double lado1;
    public double lado2;
    public double lado3;

    public  Cuadrilatero(int NLados, String nombre, double area, double perimetro, double lado1,double lado2,double lado3){
        super(NLados,nombre,area,perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public void calcular_area(){
        if (nombre.equals("Cuadrado")){
            area= lado1*lado1;
        }else if(nombre.equals("Triangulo")){
            double s = ( lado1+ lado2+lado3)/2;
            area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        }else if (nombre.equals("Rectangulo")){
            area = lado1*lado2;

        }

    }

    public  void  calcular_perimetro(){
        if (nombre.equals("Triangulo")){
            perimetro = lado1+lado2+lado3;

        }else {
            perimetro = 2*(lado1+lado2);
        }
        System.out.println("El perimetro del "+nombre+" es de: "+perimetro+"\n");

    }

    @Override
    public void mostrarInf() {
        System.out.println("El area del " + nombre + " es de: " + area + "\n"+"El perimetro es de: "+perimetro+"\n");
    }
}

