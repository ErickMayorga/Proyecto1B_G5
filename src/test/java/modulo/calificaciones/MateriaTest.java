package modulo.calificaciones;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MateriaTest {
    Materia materia;

    @Before
    public void setUp(){
        materia = new Materia("Programacion");
    }

    @Test
    public void given_materia_when_isSegundaMatricula_is_true(){
        materia.setSegundaMatricula(true);
        assertTrue(materia.isSegundaMatricula());
    }

    @Test
    public void given_materia_when_isSegundaMatricula_is_false(){
        materia.setSegundaMatricula(false);
        assertFalse(materia.isSegundaMatricula());
    }

}