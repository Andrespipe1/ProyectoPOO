import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Double valores;
        Double resultadoArea;
        Double resultadoPerimetro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la figura que desea: \n1)Cubo(Figura3D)\n" +
                "2)Figuras2D\n3)Poligono\n4)Triangulo\n5)Circulo");
        opcion = scanner.nextInt();
        switch(opcion){
            case 1:
                Figuras3D cubo = new Figuras3D();
                cubo.nombres = "cubo";
                System.out.println("Ingrese los lados del cubo");
                cubo.lados = scanner.nextInt();
                System.out.println("Ingrese las caras del cubo");
                cubo.ncaras = scanner.nextInt();
                System.out.println("Ingrese las aristas del cubo");
                cubo.arista = scanner.nextInt();
                cubo.mostrar_datos();
                System.out.println("Volumen: " + cubo.calcular_volumen(cubo.arista, cubo.ncaras));
                break;
            case 2:
                System.out.println("1)Es regular? o 2)Es irregular?\n");
                int opcion2 = scanner.nextInt();
                if( opcion2 == 1){
                    int opcion3;
                    System.out.println("1)Cuadrilateros o 2)Pentagonos");
                    opcion3 = scanner.nextInt();
                    if(opcion3 == 1){
                        System.out.println("--------Cuadrilateros---------");
                        Cuadrilateros f3=new Cuadrilateros(4,"Cuadrado",0,0,20,20,32,true);
                        System.out.println("Ingrese la longitud de los lados");
                        f3.long_lados = scanner.nextInt();
                        f3.calcularArea();
                        f3.calcularPerimetro();
                        f3.mostrar_datos();
                        f3.MostrarInformacion();
                        f3.MostrarBool();
                    }else {
                        //CLASE PENTAGONO
                        Pentagonos p1 = new Pentagonos(5, "Pentágono Regular", 0, 0, 20, 10, 50, 10);
                        System.out.println("Ingrese la apotema:");
                        p1.apotema = scanner.nextInt();
                        System.out.println("Ingrese la longitud de los lados:");
                        p1.long_lados = scanner.nextInt();
                        System.out.println("Ingrese los lados:");
                        p1.lados = scanner.nextInt();
                        System.out.println("Ingrese el valor de perimetro:");
                        p1.p = scanner.nextInt();
                        p1.calcularArea();
                        p1.calcularPerimetro();
                        p1.mostrar_datos();
                        p1.MostrarInformacion();
                        boolean esRegular = p1.esRegular();
                    }
                }
                else{
                    irregulares i1 = new irregulares(3, "Cuadrado", 23.3, 12.2, "no");
                    i1.Verficiar_irregular();
                    i1.mostrar_datos();
                }
                break;

            case 3:
                Nlados n1 = new Nlados();
                System.out.print("\nNúmero de lados de su polígono: ");
                Integer lados = scanner.nextInt();
                n1.cantidad_Lados = lados;
                n1.mostrarCantidadLados();

                break;
            case 4:
                System.out.print("Escoja el triángulo cuyos valores se calcularán: ");
                System.out.print("1. Triángulo rectángulo\n");
                System.out.print("2. Triángulo equilátero");
                Integer x = scanner.nextInt();

                switch (x)
                {
                    case 1:
                        Triangulos trianguloRec = new Triangulos();
                        System.out.print("Cateto 1: ");
                        valores = scanner.nextDouble();
                        trianguloRec.setLado1(valores);
                        System.out.print("Cateto 2: ");
                        valores = scanner.nextDouble();
                        trianguloRec.setLado2(valores);
                        System.out.print("Hipotenusa: ");
                        valores = scanner.nextDouble();
                        trianguloRec.setHipotenusa(valores);

                        resultadoArea = trianguloRec.CalcularAreaTR(trianguloRec.getLado1(), trianguloRec.getLado2());
                        resultadoPerimetro = trianguloRec.CalcularPerimetroTR(trianguloRec.getLado1(), trianguloRec.getLado2(), trianguloRec.getHipotenusa());

                        System.out.print("El área del triángulo ingresado es: " + resultadoArea);
                        System.out.print("\nEl perímetro del triángulo ingresado es: " + resultadoPerimetro);
                        break;

                    case 2:
                        Triangulos trianguloEqui = new Triangulos();
                        System.out.print("Lado 1: ");
                        valores = scanner.nextDouble();
                        trianguloEqui.setLado1(valores);
                        System.out.print("Lado 2: ");
                        valores = scanner.nextDouble();
                        trianguloEqui.setLado2(valores);
                        System.out.print("Lado 3: ");
                        valores = scanner.nextDouble();
                        trianguloEqui.setLado3(valores);

                        resultadoArea = trianguloEqui.CalcularAreaTE(trianguloEqui.getLado1());
                        resultadoPerimetro = trianguloEqui.CalcularPerimetroTE(trianguloEqui.getLado1(), trianguloEqui.getLado2(), trianguloEqui.getLado3());
                        System.out.print("El área del triángulo ingresado es: " + resultadoArea);
                        System.out.print("\nEl perímetro del triángulo ingresado es: " + resultadoPerimetro);
                        break;
                }
                break;
                
            case 5:
                Circulo circulo = new Circulo();
                System.out.print("\nRadio: ");
                valores = scanner.nextDouble();
                circulo.setRadio(valores);
                circulo.setDiametro((circulo.getRadio()*2));

                resultadoArea = circulo.CalcularAreaCirculo(circulo.getRadio());
                resultadoPerimetro = circulo.CalcularPerimetroCirculo(circulo.getRadio());

                System.out.print("El área del círculo es: " + resultadoArea + "\n");
                System.out.print("El perímetro del círculo es: " + resultadoPerimetro + "\n");
                System.out.print("El diámetro del círculo es: " + circulo.getDiametro());

                break;
            default:
                System.out.println("Ingrese un valor valido");
                /* ***********************************/
                break;
        }
    }
}
