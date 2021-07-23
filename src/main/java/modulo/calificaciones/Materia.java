package modulo.calificaciones;

public class Materia {
    private String nombre;
    private int numHoras;
    private boolean segundaMatricula;
    private boolean estadoAprobacion;
    /*Este costo materia por ahora no se si debe estar aqui o debe ser dado por tesoreria el costo
    * de horas ?*/
    double costoMateriaPorHora;
    public Materia(String nombre) {
        this.nombre = nombre;
        /*Por defecto el estado de la materia esta en false sin embargo esto se puede modificar*/
        this.estadoAprobacion=false;
    }
    public Materia(String nombre,boolean estadoAprobacion) {
        this.nombre = nombre;
        this.estadoAprobacion=estadoAprobacion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumHoras(){
        return numHoras;
    }
    public double getCostoMateriaPorHora(){
        return costoMateriaPorHora;
    }
    public boolean getSegundaMatricula(){
        return this.segundaMatricula;
    }
    public boolean getEstadoAprobacion(){
        return this.estadoAprobacion;
    }
    public boolean isEstadoAprobacion() {
        return estadoAprobacion;
    }

    public boolean isSegundaMatricula() {
        return segundaMatricula;
    }

    public void setSegundaMatricula(boolean segundaMatricula) {
        this.segundaMatricula = segundaMatricula;
    }

    public void setEstadoAprobacion(boolean estadoAprobacion) {
        this.estadoAprobacion = estadoAprobacion;
    }
}
