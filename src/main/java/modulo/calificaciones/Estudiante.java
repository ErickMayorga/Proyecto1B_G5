package modulo.calificaciones;

import modulo.matriculas.Carrera;
import modulo.matriculacion.CurriculumAcademico;
import modulo.matriculas.Pago;

public class Estudiante {
    private String nombre;
    private String apellido;
    private ReporteCalificaciones reporte;
    private Pago pago = null;
    private Carrera carrera;
    private CurriculumAcademico curriculum;
/*EsTUDIANTE es becado ?*/
    private boolean beca=false;

    public Estudiante(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.reporte= new ReporteCalificaciones();
    }
    public Estudiante(String nombre, String apellido, ReporteCalificaciones reporte){
        this.nombre=nombre;
        this.apellido=apellido;
        this.reporte=reporte;
    }

    public CurriculumAcademico getCurriculum() {
        return curriculum;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ReporteCalificaciones obtenerReporteCalificaciones(){
        return this.reporte;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Pago getPago() {
        return pago;
    }

    /*Método para realizar un pago*/
    public boolean pagarMatricula(){
        boolean validacion=false;
        if(this.pago.verificarSolicitudPago()==1)
            validacion = true;
        return validacion;
    }


    public boolean getBeca(){
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public String toString(){
        return this.nombre+" "+this.apellido+" \t|"+this.reporte.registrarBimestre1().getValorNota()
                +"|"+this.reporte.registrarBimestre2().getValorNota()+"|"+this.reporte.registrarTercerExamen().getValorNota()+"\n";
    }
}
