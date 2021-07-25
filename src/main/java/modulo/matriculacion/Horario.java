package modulo.matriculacion;

import java.util.ArrayList;

public class Horario {
    private int diaSemana;
    private ArrayList<Integer> horasClase;

    public Horario(int diaSemana, ArrayList<Integer> horasClase) {
        this.diaSemana = diaSemana;
        this.horasClase = horasClase;
    }

    public boolean validarHorario(){
        if(diaSemana>5||diaSemana<0){
            return false;
        }
        for (int horaDelDia:
             horasClase) {
            if (horaDelDia<0||horaDelDia>11){
                return false;
            }
        }
        return true;
    }
}
