package modulo.matriculas;
import modulo.calificaciones.Estudiante;

public class Arancel {
    private double valor;
    private Carrera carrera;
    private Beca beca;

    public Arancel(double valor) {
        this.valor = valor;
    }

    public void setBeca(Beca beca) {
        this.beca = beca;
    }

    public double calcularValorArancel(Estudiante estudiante){
        double valorArancelCalculado=0;
        /*Calcular el Arancel*/
        if(estudiante.getBeca()){
            valorArancelCalculado= valor - beca.calcularDescuentoPorArancel(valor);
        }
        return valorArancelCalculado;
    }


    public double getValorArancel(){
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
