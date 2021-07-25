package modulo.calificaciones;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private int numHoras;
    private boolean segundaMatricula;
    private boolean estadoAprobacion;
    ArrayList<Curso> curso = new ArrayList<Curso>();
    /*Este costo materia por ahora no se si debe estar aqui o debe ser dado por tesoreria el costo
    * de horas ?*/
    double costoMateriaPorHora;
    public Materia(String nombre) {
        this.nombre = nombre;
        /*Por defecto el estado de la materia esta en false sin embargo esto se puede modificar*/
        this.estadoAprobacion=false;
    }
    public Materia(String nombre,boolean segundaMatricula) {
        this.nombre = nombre;
        this.segundaMatricula=segundaMatricula;
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
    public void setCurso( Curso curso){
        this.curso.add(curso);
    }
    public ArrayList<Curso> getCurso(){
        return curso;
    }
}
