package taller_S8;

public class Evento extends Reservas{
    public String tipoEvento;

    public Evento(int idCliente,String nombreCliente, String fecha,double costoBase,String tipoEvento){
        super(idCliente,nombreCliente, fecha,costoBase);
        this.tipoEvento=tipoEvento;
    }

    @Override

    public void calcularCosto(){
        //a=a+b
    }

    public void MostrarInfo(){
        //System.out.println("Costo Evento: "+a);
    }

}
