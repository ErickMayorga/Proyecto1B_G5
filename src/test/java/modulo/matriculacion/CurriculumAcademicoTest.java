package modulo.matriculacion;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CurriculumAcademicoTest {


    @Test
    public void given_estudiante_when_obtenerMateriasReprobadas_then_ok() {
        Estudiante estudiante = new Estudiante("Luis","Pedri");
        CurriculumAcademico curriculumAcademico = new CurriculumAcademico();
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).add(new Materia("Politica Social"));
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).add(new Materia("Fund.Programacion"));
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).add(new Materia("Sftware Mangement"));
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).add(new Materia("Metodologias Agiles"));
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).get(0).setSegundaMatricula(true);
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).get(1).setSegundaMatricula(true);
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).get(2).setSegundaMatricula(true);
        curriculumAcademico.obtenerMateriasReprobadas(estudiante).get(3).setSegundaMatricula(true);
        CurriculumAcademico curriculumAcademico1 = new CurriculumAcademico();
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Politica Social"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Fund.Programacion"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Sftware Mangement"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).add(new Materia("Metodologias Agiles"));
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(0).setSegundaMatricula(true);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(1).setSegundaMatricula(true);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(2).setSegundaMatricula(false);
        curriculumAcademico1.obtenerMateriasReprobadas(estudiante).get(3).setSegundaMatricula(false);
        assertArrayEquals(curriculumAcademico.obtenerMateriasReprobadas(estudiante).toArray(),curriculumAcademico1.obtenerMateriasReprobadas(estudiante).toArray());
    }
}