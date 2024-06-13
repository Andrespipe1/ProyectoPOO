package taller_S8;
public class Conferencia extends Evento{
    public int idConferencia;
    public String nombreConferencia;
    public double catering;
    public double live;

    public Conferencia(int idCliente,String nombreCliente, String fecha,double costoBase,String tipoEvento,int idConferencia,String nombreConferencia,double  catering, double live){
        super(idCliente,nombreCliente, fecha,costoBase,tipoEvento);
        this.idConferencia=idConferencia;
        this.nombreConferencia=nombreConferencia;
        this.catering=catering;
        this.live=live;
    }

    @Override

    public void calcularCosto(){
        getCostoBase();
        double costoTotal=getCostoBase()+900;

    }
    public void mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }


}
