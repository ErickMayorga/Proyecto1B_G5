package modulo.main;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;
import modulo.matriculacion.CurriculumAcademico;
import modulo.matriculacion.Horario;
import modulo.matriculacion.VisualizadorMatriculas;
import modulo.matriculas.Carrera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {

        //Carrera
        Carrera carrera = new Carrera("Ingenieria de Software");

        //Materias registradas
        Materia m1 = new Materia("Programación");
        Materia m2 = new Materia("Bases de Datos");
        Materia m3 = new Materia("Metologías Ágiles");
        Materia m4 = new Materia("Compiladores y Lenguajes");
        Materia m5 = new Materia("Redes de Computadoras");
        carrera.addMateria(m1);
        carrera.addMateria(m2);
        carrera.addMateria(m3);

        //Cursos y horarios registrados
        Curso c1 = new Curso(m1,"A");
        c1.addHorario(new Horario(0,new ArrayList<Integer>(Arrays.asList(0, 1))));
        c1.addHorario(new Horario(4,new ArrayList<Integer>(Arrays.asList(4, 5)))); // Horario que choca 1
        Curso c2 = new Curso(m1,"B");
        c2.addHorario(new Horario(1,new ArrayList<Integer>(Arrays.asList(0, 1))));
        c2.addHorario(new Horario(4,new ArrayList<Integer>(Arrays.asList(3, 4)))); // Horario que choca 2
        Curso c3 = new Curso(m2,"A");
        c3.addHorario(new Horario(2,new ArrayList<Integer>(Arrays.asList(10, 11))));
        c3.addHorario(new Horario(5,new ArrayList<Integer>(Arrays.asList(6, 7))));
        Curso c4 = new Curso(m2,"B");
        c4.addHorario(new Horario(3,new ArrayList<Integer>(Arrays.asList(0, 1))));
        c4.addHorario(new Horario(0,new ArrayList<Integer>(Arrays.asList(2, 3, 4))));
        Curso c5 = new Curso(m3,"A");
        c5.addHorario(new Horario(2,new ArrayList<Integer>(Arrays.asList(3, 4, 5))));
        c5.addHorario(new Horario(4,new ArrayList<Integer>(Arrays.asList(6, 7))));

        //Caso de prueba
        Estudiante estudiante = new Estudiante("Jaime","Guevara");
        estudiante.visualizador = new VisualizadorMatriculas();
        estudiante.setCarrera(carrera);
        CurriculumAcademico curriculum = new CurriculumAcademico();
        curriculum.addMateriaInscrita(m3);
        curriculum.addMateriaInscrita(m4);
        curriculum.addMateriaInscrita(m5);
        estudiante.setCurriculum(curriculum);
        estudiante.getCurriculum().cambiarEstadoMateriaReprobada(m3);

        Scanner entrada = new Scanner(System.in);
        int opServicio = 0, opMateria = 0, opCurso = 0;
        Materia materiaAux = null;
        Curso cursoAux = null;

        ArrayList<Curso> cursosInscritos = new ArrayList<Curso>();
        int[][] matrizHorarios = new int[12][6];

        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("SERVICIOS ESTUDIANTILES");
        System.out.println("1. Visualización de notas");
        System.out.println("2. Matriculación");
        System.out.print("Seleccione un servicio: ");
        opServicio = entrada.nextInt();
        entrada.skip("\n");
        switch(opServicio){
            case 1:
                break;
            case 2:
                estudiante.visualizador.mostrarMateriasDisponibles(estudiante);
                System.out.print("Seleccione una materia: ");
                opMateria = entrada.nextInt();
                entrada.skip("\n");

                materiaAux = estudiante.visualizador.getMateriasDisponibles().get(opMateria-1);
                estudiante.visualizador.mostrarHorariosDeMateria(materiaAux);
                System.out.print("Seleccione un curso: ");
                opCurso = entrada.nextInt();
                entrada.skip("\n");

                break;
            default:
                System.out.println("La opcion ingresada es incorrecta");
                break;
        }
    }
}

