package taller_S8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Bodas boda1=new Bodas(175427864,"Andres Galo","24/06/2024",100,"Boda",6321,56,500,300);
        Bodas boda2=new Bodas(175427864,"Juan Galo","24/06/2024",100,"Boda",6321,56,500,0);
        Bodas boda3=new Bodas(175427864,"Juan Galo","24/06/2024",100,"Boda",6321,56,0,300);

        Conciertos con1=new Conciertos(2132549875,"Andy Perez","24/06/2024",250,"Concierto",4561,100,0,100);
        Conciertos con2=new Conciertos(1012324515,"Juan Diaz","29/07/2024",250,"Concierto",4565,56,3000,0);
        Conciertos con3=new Conciertos(1518974662,"Juan Almeda","30/08/2024",250,"Concierto",4562,201,3000,100);

        Conferencia cf1=new Conferencia(175427864,"Andres Galo","24/06/2024",100,"Conferencia",6321,"Conferencia",200,0);
        Conferencia cf2=new Conferencia(175427864,"Andres Galo","24/06/2024",100,"Conferencia",6321,"Conferencia",0,100);
        Conferencia cf3=new Conferencia(175427864,"Andres Galo","24/06/2024",100,"Conferencia",6321,"Conferencia",200,100);
        System.out.println("\tSISTEMA DE RESERVAS\t\nSeleccione un tipo de evento");
        while(true) {
            System.out.println("1) Conferencia\n2) Boda\n3) Concierto\n4)Salir\nIngrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--Evento: Conferencia\n");

                    System.out.println("Ingrese que tipo de servicio desea Incluir\n");
                    System.out.println("1) Catering\n2)Equipo Audiovisual\n3) Ambos\nIngrese una opción:");
                    int opc1 =leer.nextInt();
                    switch (opc1){
                        case 1:
                            System.out.println("Catering");
                            cf1.mostrarInfo();
                            cf1.calcularCosto();
                            break;
                        case 2:
                            System.out.println("Equipo Audiovisual");
                            cf2.mostrarInfo();
                            cf2.calcularCosto();
                            break;
                        case 3:
                            System.out.println("Ambos servicios seleccionados");
                            cf3.mostrarInfo();
                            cf3.calcularCosto();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    }
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
                    System.out.println("Ingrese que tipo de servicio desea Incluir\n");
                    System.out.println("1) Seguridad \n2)Estand\n3) Ambos\nIngrese una opción:");
                    int opcion3 =leer.nextInt();
                    switch (opcion3){
                        case 1:
                            System.out.println("Seguridad");
                            con2.mostrarInfo();
                            con2.calcularCosto();
                            break;
                        case 2:
                            System.out.println("Stand");
                            con1.mostrarInfo();
                            con1.calcularCosto();
                            break;
                        case 3:
                            System.out.println("Ambos servicios seleccionados");
                            con3.mostrarInfo();
                            con3.calcularCosto();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    }
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
