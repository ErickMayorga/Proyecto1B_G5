package modulo.calificaciones;

public class ReporteCalificaciones {
    private Calificacion bimestre1;
    private Calificacion bimestre2;
    private Calificacion tercerExamen;

    public ReporteCalificaciones(){
        this.bimestre1= new Calificacion(0);
        this.bimestre2= new Calificacion(0);
        this.tercerExamen=new Calificacion(0);
    }

    public ReporteCalificaciones(Calificacion bimestre1){
        this.bimestre1=bimestre1;
    }

    public Calificacion registrarBimestre1() {
        return bimestre1;
    }

    public Calificacion registrarBimestre2() {
        return bimestre2;
    }

    public Calificacion registrarTercerExamen() {
        return tercerExamen;
    }

    public void setBimestre1(Calificacion bimestre1) {
        this.bimestre1 = bimestre1;
    }

    public void setBimestre2(Calificacion bimestre2) {
        this.bimestre2 = bimestre2;
    }

    public void setTercerExamen(Calificacion tercerExamen) {
        this.tercerExamen = tercerExamen;
    }

    public void registrarCalificacion(Calificacion calificacion, int opcionCal) {
        switch (opcionCal) {
            case 1:
                setBimestre1(calificacion);
                break;
            case 2:
                setBimestre2(calificacion);
                break;
            case 3:
                setTercerExamen(calificacion);
                break;
            default:
                break;
        }
    }
}
