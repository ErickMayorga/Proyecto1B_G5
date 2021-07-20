package modulo.matriculas;

public class Beca {
    private String tipoBeca;
    private double porcentajeBeca;

    public Beca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }

    public double calcularDescuentoPorMatricula(double valorMatricula){

        return valorMatricula*porcentajeBeca;
    }

    public double calcularDescuentoPorArancel(double valorArancel) {

        return valorArancel*porcentajeBeca;
    }
}
