package taller_S8;
import java.util.Scanner;
public class Bodas extends Evento {
        public int idBoda;
        public int numinivtados;
        public double decoFlores;
        public double musicaLive;

        public Bodas(int idCliente,String nombreCliente, String fecha,double costoBase, String tipoEvento, int idBoda, int numinivtados, double decoFlores, double musicaLive) {
            super(idCliente, nombreCliente, fecha, costoBase, tipoEvento);
            this.idBoda = idBoda;
            this.numinivtados = numinivtados;
            this.decoFlores = decoFlores;
            this.musicaLive = musicaLive;
        }

        public void calcularCosto() {
            getCostoBase();
            double monto = getCostoBase()+1900+decoFlores+musicaLive;
            System.out.println("\nCosto Total Boda: "+monto+" $");
    }

    public void mostrarInfo(){
            super.mostrarInfo();
        System.out.println("\n"+"------ Boda ------"+"\n"+"El numero de invitados es:"+numinivtados+"\nPrecio decoracion de flores: "+decoFlores+"\n"+"Precio Musica en vivo: "+musicaLive);
    }
}


