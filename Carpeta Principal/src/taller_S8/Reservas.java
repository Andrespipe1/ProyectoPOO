package taller_S8;

public class Reservas{
    private int idCliente;
    private String nombreCliente;
    private String fecha;
    private double costoBase;

    public int getIdCliente() {
        return idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public Reservas(int idCliente, String fecha,String nombreCliente,double costoBase){
        this.idCliente=idCliente;
        this.fecha=fecha;
        this.nombreCliente=nombreCliente;
        this.costoBase=costoBase;
    }
    public void calcularCosto(){
        getCostoBase();
    }
    public void mostrarInfo(){
        System.out.println("----RESERVACION----\nDatos cliente\nId:"+getIdCliente()+"Nombre: "+getNombreCliente()+"Fecha reserva: "+getFecha());
    }
}
