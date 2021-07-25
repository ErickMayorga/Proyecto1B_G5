package modulo.matriculacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VisualizadorMatriculasTest {
VisualizadorMatriculas visualizadorMatriculas;
ArrayList<Integer> horario;
    @Before
    public void setUp()  {
        visualizadorMatriculas = new VisualizadorMatriculas();
         horario = new ArrayList<Integer>();
        horario.add(4);
        horario.add(5);
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void given_numeroDeDiaDeSemana_when_transformarNumeroADiaDeSemana_then_ok() {
        assertEquals("Martes",visualizadorMatriculas.transformarNumeroADiaDeSemana(1));
    }

    @Test
    public void given_numeroHorario_when_tranformarNumeroAHorario_then_ok() {
        assertEquals("11-13",visualizadorMatriculas.tranformarNumeroAHorario(horario));
    }
}