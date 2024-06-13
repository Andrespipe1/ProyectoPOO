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
        getCostoBase();
        double monto = getCostoBase()+1900+seguridad+stand;
        System.out.println("\nCosto Total Boda: "+monto+" $");
    }
    public void mostrarInfo(){
        System.out.println("\n"+"------ Concierto ------"+"\n"+"El numero de invitados es:"+numinivtados+"\n"+"Precio de Seguridad: "+seguridad+"\n"+"Precio de Satnd: "+stand);

    }
}
