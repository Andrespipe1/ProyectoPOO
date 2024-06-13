package taller_S8;
public class Conferencia extends Evento{
    public int idConferencia;
    public String nombreConferencia;

    public Conferencia(int idCliente,String nombreCliente, String fecha,double costoBase,String tipoEvento,int idConferencia,String nombreConferencia){
        super(idCliente,nombreCliente, fecha,costoBase,tipoEvento);
        this.idConferencia=idConferencia;
        this.nombreConferencia=nombreConferencia;
    }

    @Override

    public void calcularCosto(){
        //a=a+b

    }
    public void mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }


}
