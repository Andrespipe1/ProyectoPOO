package taller_S8;

public class Evento extends Reservas{
    public String tipoEvento;

    public Evento(int idCliente,String nombreCliente, String fecha,double costoBase,String tipoEvento){
        super(idCliente,nombreCliente, fecha,costoBase);
        this.tipoEvento=tipoEvento;
    }

    @Override
    public void calcularCosto(){
        getCostoBase();
    }
    public void mostrarInfo(){
        System.out.println("Tipo Evento: "+ tipoEvento);
    }

}
