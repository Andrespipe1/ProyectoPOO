package Figuras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Cuadrilatero FIGURA4 = new Cuadrilatero(4,"Cuadrado",0,0,"Regular",15,15,15);
        Cuadrilatero FIGURA5 = new Cuadrilatero(3,"Triangulo",0,0,"Regular",11,15,10);
        Cuadrilatero FIGURA6 = new Cuadrilatero(4,"Rectangulo",0,0,"Regular",15,25,20);
        Triangulo    FIGURA7 = new Triangulo(3,"Triangulo",0,0,10,20);
        Circulo FIGURA8 = new Circulo(1,"Circulo",0,0,"Regular",0,15,6.5);
        Otros FIGURA9 = new Otros(5,"Pentagono",0,0,"Regular",20,30.0);
                Scanner input = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("Menú:");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Cuadrado");
                    System.out.println("3. Triangulo");
                    System.out.println("4. Rectangulo");
                    System.out.println("5. Circulo");
                    System.out.println("6. Otros");
                    System.out.println("0. Salir");
                    System.out.print("Elige una opción: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            FIGURA7.mostrarInf();

                            break;
                        case 2:
                            FIGURA4.mostrarInf();


                            break;
                        case 3:
                            FIGURA5.mostrarInf();
                            break;
                        case 4:
                            FIGURA6.mostrarInf();

                            break;
                        case 5:
                            FIGURA8.mostrarInf();
                        break;
                        case 6:
                            FIGURA9.mostrarInf();
                            break;
                        case 0:
                            System.out.println("¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
                } while (choice != 0);

                input.close();
            }


}
