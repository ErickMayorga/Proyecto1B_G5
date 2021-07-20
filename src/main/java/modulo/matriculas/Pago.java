package modulo.matriculas;

public class Pago {
    private double valorPago;
    private Arancel arancel;
    private Matricula matricula;
    private String estado;
    private Fecha fecha;
    private IGeneradorPago generadorPago;

    public Pago(IGeneradorPago generadorPago) {
        this.generadorPago = generadorPago;
    }

    public Pago(Arancel arancel, Matricula matricula) {
        this.arancel = arancel;
        this.matricula = matricula;
    }

    public void setArancel(Arancel arancel) {
        this.arancel = arancel;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public IGeneradorPago getGeneradorPago() {
        return generadorPago;
    }

    public double calcularValorPago(){
        this.valorPago=arancel.getValorArancel()+matricula.getValorMatricula();
        return valorPago;
    }
    public int verificarSolicitudPago(){
        System.out.println(this.generadorPago.realizarSolicitudPago(this));
        return this.generadorPago.realizarSolicitudPago(this);
    }
    public Fecha getFecha(){
        return fecha;
    }

}
