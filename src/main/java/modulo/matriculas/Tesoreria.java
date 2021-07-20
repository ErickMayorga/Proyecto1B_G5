package modulo.matriculas;

public class Tesoreria {
    private Pago pago;
    private double totalPagos;
    public void registrarPago(){
        totalPagos+=this.pago.calcularValorPago();
    }

    public void notificarPago(){

    }

    public void verificarPago(){
        if(!pago.getFecha().compararConFechaActual()){
            this.cancelarMatricula();
        }
    }

    public void cancelarMatricula(){

    }

}
