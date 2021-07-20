package modulo.calificaciones;

public class Materia {
    private String nombre;
    private int numHoras;
    private boolean segundaMatricula;
    /*Este costo materia por ahora no se si debe estar aqui o debe ser dado por tesoreria el costo
    * de horas ?*/
    double costoMateriaPorHora;
    public Materia(String nombre) {
        this.nombre = nombre;
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

    public boolean isSegundaMatricula() {
        return segundaMatricula;
    }

    public void setSegundaMatricula(boolean segundaMatricula) {
        this.segundaMatricula = segundaMatricula;
    }
}
