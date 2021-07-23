package modulo.matriculacion;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;
import modulo.matriculas.Carrera;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CurriculumAcademicoTest {


    @Test
    public void given_estudiante_when_obtenerMateriasReprobadas_then_ok() {
        Estudiante estudiante = new Estudiante("Luis", "Pedri");
        CurriculumAcademico curriculumAcademico1 = new CurriculumAcademico();
        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        listaMaterias.add(new Materia("Politica Social",true));
        listaMaterias.add(new Materia("Entorno Operaivo"));
        listaMaterias.add(new Materia("Metodologias Agiles"));
        listaMaterias.add(new Materia("Finanzas"));
        Carrera carrera = new Carrera(listaMaterias);
        estudiante.setCarrera(carrera);
        int i = 0;
        /*comprueba que todas las materias obtenidas por el metodo tengan isSegunda en true o que retorne vacio*/
        while (i < curriculumAcademico1.obtenerMateriasReprobadas(estudiante).size() - 1) {
            assertTrue(curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(i).isSegundaMatricula());
            i++;
        }

    }
}