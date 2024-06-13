package taller_S8;
public class Conferencia extends Evento{
    public int idConferencia;
    public String nombreConferencia;
    public double catering;
    public double live;
    //public double monto;

    public Conferencia(int idCliente,String nombreCliente, String fecha,double costoBase,String tipoEvento,int idConferencia,String nombreConferencia,double  catering, double live){
        super(idCliente,nombreCliente, fecha,costoBase,tipoEvento);
        this.idConferencia=idConferencia;
        this.nombreConferencia=nombreConferencia;
        this.catering=catering;
        this.live=live;
        //this.monto=monto;
    }
    double monto;
    @Override

    public void calcularCosto(){
        getCostoBase();
        double monto = getCostoBase()+1000+catering+live;
        System.out.println("\nCosto Total Conferencia: "+monto+" $");


    }
    public void mostrarInfo(){
        System.out.println("\n-------Conferencia--------\nServicio de catering: "+catering+"$ \nEquipo audiovisual: "+live);

    }


}
