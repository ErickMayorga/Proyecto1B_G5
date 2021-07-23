package modulo.matriculacion;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;
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
        curriculumAcademico1.getMateriasIncritas().add(new Materia("Politica Social"));
        curriculumAcademico1.getMateriasIncritas().add(new Materia("Fund.Programacion",true));
        curriculumAcademico1.getMateriasIncritas().add(new Materia("Sftware Mangement"),true);
        curriculumAcademico1.getMateriasIncritas().add(new Materia("Metodologias Agiles"));
        int i = 0;
        /*comprueba que todas las materias obtenidas por el metodo tengan estado de aprobacion false*/
        while (i < curriculumAcademico1.obtenerMateriasReprobadas(estudiante).size() - 1) {
            assertFalse(curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(i).getEstadoAprobacion());
            i++;
        }

    }
}