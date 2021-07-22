package modulo.main;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;
import modulo.matriculacion.VisualizadorMatriculas;
import modulo.matriculas.Carrera;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {

        //Datos iniciales
        Estudiante estudiante = new Estudiante("Jaime","Guevara");
        estudiante.visualizador = new VisualizadorMatriculas();
        Carrera carrera = new Carrera("Ingenieria de Software");

        //Materias registradas
        Materia m1 = new Materia("Programación");
        Materia m2 = new Materia("Bases de Datos");
        Materia m3 = new Materia("Metologías Ágiles");

        //Cursos registrados
        Curso c1 = new Curso(m1,"A");
        Curso c2 = new Curso(m1,"B");
        Curso c3 = new Curso(m2,"A");
        Curso c4 = new Curso(m2,"B");
        Curso c5 = new Curso(m2,"C");
        Curso c6 = new Curso(m3,"A");



        //Programa
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

