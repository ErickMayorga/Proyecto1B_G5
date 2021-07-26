package modulo.matriculacion;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HorarioTest {
    Horario horario=null;
    ArrayList<Integer> horasDia;
    @Before
    public void setup(){
        horasDia= new ArrayList<Integer>();
        horasDia.add(0);
        horasDia.add(1);
        Horario horario = new Horario(4,horasDia);
    }

    @Test
    public void given_horario_when_validarHorario_then_ok() {

        assertTrue(horario.validarHorario());
    }
    @Test
    public void given_horarioincorrecto_when_validarHorario_then_returnfalse(){
        horario=new Horario(7,horasDia);
        assertFalse(horario.validarHorario());
    }
}