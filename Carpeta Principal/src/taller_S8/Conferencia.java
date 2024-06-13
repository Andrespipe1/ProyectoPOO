public class Conferencia extends Evento{
    public int idConferencia;
    public String nombreConferencia;

    public Conferencia(int IdCliente,String fecha,double costoBase,String tipoEvento,int idConferencia,String nombreConferencia){
        super(IdCliente,fecha, costoBase,tipoEvento);
        this.idConferencia=idConferencia;
        this.nombreConferencia=nombreConferencia;
    }

    @Override

    private static void calcularCosto(){
        //a=a+b

    }

    public mostrarInfo(){
        //System.out.println("El costo de la conferencia es: "+a);

    }


}
