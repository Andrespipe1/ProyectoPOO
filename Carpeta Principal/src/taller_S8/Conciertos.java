package taller_S8;

public class Conciertos extends Evento {
    public int idConcierto;
    public int numinivtados;

    public Conciertos(int idCliente, String nombreCliente, String fecha, double costoBase, String tipoEvento, int idConcierto, int numinivtados) {
        super(idCliente,nombreCliente, fecha,costoBase, tipoEvento);
        this.idConcierto = idConcierto;
        this.numinivtados = numinivtados;
    }
@Override
    public void calcularCosto(){

    }
    public void mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }
}
