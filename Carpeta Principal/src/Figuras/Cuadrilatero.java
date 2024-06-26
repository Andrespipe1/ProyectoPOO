package Figuras;

public class Cuadrilatero extends Regulares{
  public double lado1;
    public double lado2;
    public double lado3;

    public  Cuadrilatero(int NLados, String nombre, double area, double perimetro,String tipo, double lado1,double lado2,double lado3){
        super(NLados,nombre,area,perimetro,tipo);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double calcular_area(){
        if (nombre.equals("Cuadrado")){
            area= lado1*lado1;
        }else if(nombre.equals("Triangulo")){
            double s = ( lado1+ lado2+lado3)/2;
            area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        }else if (nombre.equals("Rectangulo")){
            area = lado1*lado2;

        }
        return area;

    }

    public  double  calcular_perimetro(){
        if (nombre.equals("Triangulo")){
            perimetro = lado1+lado2+lado3;

        }else {
            perimetro = 2*(lado1+lado2);
        }


        return perimetro;

    }

    @Override
    public void mostrarInf() {
        System.out.println("El area del " + nombre + " es de: " + calcular_area() + "\n"+"El perimetro es de: "+calcular_perimetro()+"\n");
    }
}


