package taller_S8;

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
            //a+b
    }
    public void mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }
}
