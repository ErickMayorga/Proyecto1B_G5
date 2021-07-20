package modulo.calificaciones;

public class Calificacion {
    private double valorNota;
    private static final double valorMaximo = 10;
    private static final double valorMinimo = 0;
    private double ponderacion;

    public Calificacion(double nota){
        this.valorNota=nota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public static boolean validarCalificacion(double calificacion){
        return (calificacion>=valorMinimo && calificacion<=valorMaximo);
    }
}
