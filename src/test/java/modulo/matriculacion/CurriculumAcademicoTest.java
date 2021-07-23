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
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Politica Social"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Fund.Programacion"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Sftware Mangement"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Metodologias Agiles"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(0).setEstadoAprobacion(true);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(1).setEstadoAprobacion(true);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(2).setEstadoAprobacion(true);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(3).setEstadoAprobacion(true);
        int i = 0;
        while (i < curriculumAcademico1.obtenerMateriasReprobadas(estudiante).size() - 1) {
            assertTrue(curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(i).getEstadoAprobacion());
            i++;
        }

    }
}