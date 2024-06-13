package taller_S8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Bodas boda1=new Bodas(175427864,"Andres Galo","24/06/2024",100,"Boda",6321,56,500,300);
        Bodas boda2=new Bodas(175427864,"Juan Galo","24/06/2024",100,"Boda",6321,56,500,0);
        Bodas boda3=new Bodas(175427864,"Juan Galo","24/06/2024",100,"Boda",6321,56,0,300);


        Conferencia cf1=new Conferencia(175427864,"Andres Galo","24/06/2024",100,"Boda",6321,"asdsad",500,300);
        System.out.println("\tSISTEMA DE RESERVAS\t\nSeleccione un tipo de evento");
        while(true) {
            System.out.println("1) Conferencia\n2) Boda\n3) Concierto\n4)Salir\nIngrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--Evento: Conferencia\n");
                    break;
                case 2:
                    System.out.println("--Evento: Boda\n");
                    System.out.println("Ingrese que tipo de servicio desea Incluir\n");
                    System.out.println("1) Decoración Floral\n2)Musica en vivo\n3) Ambos\nIngrese una opción:");
                    int opc =leer.nextInt();
                    switch (opc){
                        case 1:
                            System.out.println("Decoración Floral seleccionada");
                            boda2.mostrarInfo();
                            boda2.calcularCosto();
                            break;
                        case 2:
                            System.out.println("Música en vivo seleccionada");
                            boda3.mostrarInfo();
                            boda3.calcularCosto();
                            break;
                        case 3:
                            System.out.println("Ambos servicios seleccionados");
                            boda1.mostrarInfo();
                            boda1.calcularCosto();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    }

                    break;
                case 3:
                    System.out.println("--Evento: Concierto\n");
                    break;
                case 4:
                    cf1.mostrarInfo();
                    cf1.calcularCosto();

                    System.out.println("Gracias por usar nuestro sistema :)");
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        }

    }
}
