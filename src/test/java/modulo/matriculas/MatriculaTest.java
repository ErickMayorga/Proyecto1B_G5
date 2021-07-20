package modulo.matriculas;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Materia;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculaTest {
    Matricula matricula =null;
    Beca beca = null;
    Materia materia1 = null;
    Materia materia2 = null;

    @Before
    public void setUp(){
        matricula= new Matricula(0);
        materia1 = new Materia("Programacion");
        materia1.setSegundaMatricula(true);
        materia2 = new Materia("Metodologias Agiles");
        materia2.setSegundaMatricula(true);
        matricula.addCurso(new Curso(materia1,"A"));
        matricula.addCurso(new Curso(materia2,"B"));
    }

    @Test
    public void given_matricula_when_beca_is_null(){
        matricula.setBeca(beca);
        assertNull(matricula.getBeca());
    }

    @Test
    public void given_matricula_when_beca_is_not_null(){
        beca = new Beca(0.6);
        matricula.setBeca(beca);
        assertNotNull(matricula.getBeca());
    }

    @Test
    public void given_materiasRepetidas_when_array_is_ok(){
        Object[] expected = new Object[]{materia1, materia2}; //Materias repetidas
        Object[] actual = matricula.getMateriasSegundaMatricula().toArray();
        assertArrayEquals(expected,actual);
    }

}