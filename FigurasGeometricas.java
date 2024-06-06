import java.lang.Math;

class FigurasGeometricas {
    public int lados;
    public String nombres;
    public FigurasGeometricas(int lados, String nombres){
        this.lados = lados;
        this.nombres = nombres;
    }
    public FigurasGeometricas()
    {
    }
    public void mostrar_datos(){
        System.out.println("Lados: "+lados);
        System.out.println("Nombres: "+nombres);
    }
}

class Figuras3D extends FigurasGeometricas{
    public int ncaras;
    public double arista;
    public Figuras3D(int lados, String nombres, int ncaras, double arista){
        super(lados, nombres);
        this.ncaras=ncaras;
        this.arista=arista;
    }
    public Figuras3D(){

    }
    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Caras: "+ncaras);
        System.out.println("Arista: "+arista);
    }
    public double calcular_volumen(double arista, int ncaras){
        if(ncaras==6){
            return Math.pow(arista, 3);
        }
        else {
            System.out.println("Figura no reconocida o fórmula no definida.");
            return 0;
        }
    }
}

class Figuras2D extends FigurasGeometricas{
    public double area;
    public double perimetro;
    public Figuras2D(int lados, String nombres, double area, double perimetro){
        super(lados, nombres);
        this.area = area;
        this.perimetro = perimetro;
    }

    public Figuras2D()
    {
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Area: "+ area);
        System.out.println("Perimetro: "+perimetro);
    }

    public double calcula_area(double area) {
        return area;
    }

    public double calcula_perimetro(double perimetro){
        return perimetro;
    }
}

//IRREGULARES
class irregulares extends Figuras2D{
    public String verficiar;
    public irregulares(int lados, String nombres, double area, double perimetro, String verficiar){
        super(lados, nombres, area, perimetro);
        this.verficiar = verficiar;
    }
    public void Verficiar_irregular(){
        if ((verficiar == "Si") || (verficiar == "si") || (verficiar == "SI")){
            System.out.println("Una figura geometrica irregular tiene sus lados de diferentes medidas");
        }
        else{
            System.out.println("Verifique su informacion");
            verficiar = "no";
        }
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Figura irregular: "+ verficiar);

    }
}




//REGULARES
class Regulares extends Figuras2D{
    public double apotema;
    public double long_lados;
    public double p;


    public Regulares(int lados, String nombres, double area, double perimetro, double apotema, double long_lados, double p){
        super(lados, nombres, area, perimetro);
        this.apotema=apotema;
        this.long_lados=long_lados;
        this.p=p;

    }

    public Regulares()
    {
    }

    public double calcularArea() {
        area+=((p  * apotema) / 2);
        return area;

    }

    public double calcularPerimetro() {
        perimetro+=lados * long_lados;
        return perimetro;

    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
    }
    public void MostrarInformacion(){
        System.out.println("*************Datos ingresados*************");
        System.out.println("Perimetro: "+p);
        System.out.println("Apotema: "+apotema);
        System.out.println("Lados: "+lados);
        System.out.println("Longitud de los lados: "+long_lados);
    }

}

class Cuadrilateros extends Regulares{
    public boolean regular;
    public Cuadrilateros(int lados, String nombres, double area, double perimetro,double apotema,double long_lados,double p,boolean regular){
        super(lados, nombres, area, perimetro, apotema, long_lados, p);
        this.regular=regular;
    }

    public double calcularArea() {
        area+=(long_lados  * long_lados) ;
        return area;

    }

    public double calcularPerimetro() {
        perimetro+=long_lados + long_lados+long_lados + long_lados;
        return perimetro;

    }
    @Override
    public void mostrar_datos() {
        System.out.println("*************Poligono Regular*************");
        super.mostrar_datos();

    }
    
    public void MostrarBool(){
        System.out.println("El cuadrilatero es regular: "+regular);
    }


}


class Triangulos extends Regulares{
    private Boolean triangulo;
    private Double lado1;
    private Double lado2;
    private Double lado3;
    private Double hipotenusa;

    //Método constructor
    public Triangulos()
    {
    }

    //Métodos
    public void MostrarInformacionTriangulo()
    {
        System.out.println("****** Triángulo ******");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + hipotenusa);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    //Area
    public double CalcularAreaTR(double lado1, double lado2)
    {
        Double area = (lado1 * lado2)/2;
        return area;
    }

    public double CalcularAreaTE(double lado1)
    {
        double A = ((lado1*lado1) * Math.sqrt(3))/4;
        return A;
    }


    //Perímetro
    public double CalcularPerimetroTR(double lado1, double lado2, double hipotenusa)
    {
        Double perimetro = lado1 + lado2 + hipotenusa;
        return perimetro;
    }

    public double CalcularPerimetroTE(double lado1, double lado2, double lado3)
    {
        Double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    //Setters y getters
    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public void setHipotenusa(Double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public Double getLado1() {
        return lado1;
    }
    public Double getLado2() {
        return lado2;
    }
    public Double getHipotenusa() {return hipotenusa;}

    public void setTriangulo(Boolean triangulo) {
        this.triangulo = triangulo;
    }
    public Boolean getTriangulo() {
        return triangulo;
    }
    public Double getLado3() {
        return lado3;
    }
}








//OTROS
//Nicolas Luna
class Pentagonos extends Regulares{
    public int medidas_lados;

    public Pentagonos(int lados, String nombres, double area, double perimetro, double apotema, double long_lados, double p, int medidas_lados) {
        super(lados, nombres, area, perimetro, apotema, long_lados, p);
        this.medidas_lados = medidas_lados;
    }

    public Pentagonos()
    {
    }

    @Override
    public double calcularArea() {
        area+=((p  * apotema) / 2);
        return area;

    }
    @Override
    public double calcularPerimetro() {
        perimetro+=lados * long_lados;
        return perimetro;

    }
    public void MostrarInformacion(){
        System.out.println("******Datos ingresados*******");
        System.out.println("Perimetro: "+p);
        System.out.println("Apotema: "+apotema);
        System.out.println("Lados: "+lados);
        System.out.println("Longitud de los lados: "+long_lados);
    }

    @Override
    public void mostrar_datos() {

        super.mostrar_datos();

    }
    //MEOTODO UNICO PARA CLASE Pentagono
        //Metodo para verificar si el pentagono es recular o no
    public boolean esRegular() {
        if (long_lados == medidas_lados) {
            System.out.println("Si es regular");
            return true;
        } else {
            System.out.println("No es regular");
            return false;
        }
    }
}

class Nlados extends Pentagonos{
    public int cantidad_Lados;

    public Nlados(int lados, String nombres, double area, double perimetro, double apotema, double long_lados, double p, int medidas_lados, int cantidad_Lados) {
        super(lados, nombres, area, perimetro, apotema, long_lados, p, medidas_lados);
        this.cantidad_Lados = cantidad_Lados;
    }

    public Nlados()
    {
    }

    //METODOS HEREDADOS
    @Override
    public double calcularArea() {
        area+=((p  * apotema) / 2);
        return area;

    }
    @Override
    public double calcularPerimetro() {
        perimetro+=lados * long_lados;
        return perimetro;

    }
    @Override
    public void mostrar_datos() {
        super.mostrar_datos();

    }
    public void MostrarInformacion(){
        System.out.println("******Datos ingresados*******");
        System.out.println("Perimetro: "+p);
        System.out.println("Apotema: "+apotema);
        System.out.println("Lados: "+lados);
        System.out.println("Longitud de los lados: "+long_lados);
    }
    @Override
    public boolean esRegular() {
        if (long_lados == medidas_lados) {
            System.out.println("Si es regular");
            return true;
        } else {
            System.out.println("No es regular");
            return false;
        }
    }
    //METODO UNICO PARA LA CLASE Nlados
    public void mostrarCantidadLados() {
        System.out.println("El polígono tiene " + cantidad_Lados + " lados.");
    }
}

class Circulo extends Pentagonos
{
    private Double radio;
    private Double diametro;
    private Boolean circulo;

    //Método constructor
    public Circulo()
    {
    }

    //Métodos
    public void MostrarInformacionCirculo()
    {
        System.out.println("******* Círculo *******");
        System.out.println("Radio: " + radio);
        System.out.println("Diámetro: " + (radio*2));
        System.out.println("Area: " + area);
        System.out.println("Perímetro: " + perimetro + "\n");
    }

        //Area
    public double CalcularAreaCirculo(double radio)
    {
        Double resultado = (3.1415*(radio*radio));
        return resultado;
    }

        //Perímetro
    public double CalcularPerimetroCirculo(double radio)
    {
        Double resultado = 2 * 3.1415 * radio;
        return resultado;
    }
    //Setters y Getters
    public void setCirculo(Boolean circulo) {
        this.circulo = circulo;
    }
    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Boolean getCirculo() {
        return circulo;
    }
    public Double getDiametro() {
        return diametro;
    }
    public Double getRadio() {
        return radio;
    }
}
