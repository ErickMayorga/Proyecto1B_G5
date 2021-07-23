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
        return true;
    }
}
