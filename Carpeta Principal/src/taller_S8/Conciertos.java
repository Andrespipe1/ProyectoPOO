package taller_S8;

public class Conciertos extends Evento {
    public int idConcierto;
    public int numinivtados;
    public double seguridad;
    public double stand;

    public Conciertos(int idCliente, String nombreCliente, String fecha, double costoBase, String tipoEvento, int idConcierto, int numinivtados,double seguridad,double stand) {
        super(idCliente,nombreCliente, fecha,costoBase, tipoEvento);
        this.idConcierto = idConcierto;
        this.numinivtados = numinivtados;
        this.seguridad=seguridad;
        this.stand=stand;
    }
@Override
    public void calcularCosto(){
        //a+b
    }
    public void mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }
}
