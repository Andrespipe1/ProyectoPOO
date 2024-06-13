public class Evento extends Reserva{
    public String tipoEvento;

    public Evento(int IdCliente,String fecha,double costoBase,String tipoEvento){
        super(IdCliente,fecha, costoBase);
        this.tipoEvento=tipoEvento;
    }

    @Override

    private static void calcularCosto(){
        //a=a+b
    }
    
    public static void MostrarInfo(){
        System.out.println("Tipo Evento: "+ tipoEvento);
    }

    
}
