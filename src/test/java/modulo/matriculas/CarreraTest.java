package modulo.matriculas;

import modulo.calificaciones.Materia;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class CarreraTest {
    Carrera carrera1;
    Carrera carrera2;

    @Before
    public void setUp(){
        carrera1 = new Carrera(new ArrayList<Materia>());
        carrera2 = new Carrera(new ArrayList<Materia>());

    }

    @Test
    public void given_two_careers_when_subjects_are_the_same(){
        Materia materia = new Materia("Calculo Vectorial");
        carrera1.addMateria(materia);
        carrera2.addMateria(materia);
        assertSame(carrera1.getMaterias().get(0),carrera2.getMaterias().get(0));
    }

    @Test
    public void given_two_careers_when_subjects_are_not_the_same(){
        Materia materia1 = new Materia("Calculo Vectorial");
        Materia materia2 = new Materia("Mecanica Newtoniana");
        carrera1.addMateria(materia1);
        carrera2.addMateria(materia2);
        assertNotSame(carrera1.getMaterias().get(0),carrera2.getMaterias().get(0));
    }

}
