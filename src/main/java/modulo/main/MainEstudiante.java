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
    public static boolean estaOcupadoHorario(Curso curso,int[][] semana){
        for (Horario horario:curso.getHorarios()){
            for(int horaDia:horario.getHorasClase()){
                System.out.println("NUme dia:"+horario.getDiaSemana()+"Nume hora:"+horaDia);
                if(semana[horaDia][horario.getDiaSemana()]!=0){
                    return true;
                }

            }
        }
        return false;
    }
    public static int[] puestoOcupadoHorario(Curso curso,int[][] semana){
        int puestoOcupado[]= {0,0};
        for (Horario horario:curso.getHorarios()){
            for(int horaDia:horario.getHorasClase()){
                if(semana[horaDia][horario.getDiaSemana()]!=0){
                    puestoOcupado[0]=horario.getDiaSemana();
                    puestoOcupado[1]=horaDia;
                }

            }
        }
        return puestoOcupado;
    }
    public static void registrarMateria(Curso curso,int[][] semana,int materiaSelec){
        int puestoOcupado[]= {0,0};
        for (Horario horario:curso.getHorarios()){
            for(int horaDia:horario.getHorasClase()){
                semana[horaDia][horario.getDiaSemana()]=materiaSelec;

            }
        }
    }
    public static void imprimirMatriz(int[][] matriz){

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf(String.valueOf(matriz[i][j]));
            }
            System.out.println("");
        }
    }
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
        Curso c1 = new Curso(m1, "A");
        c1.addHorario(new Horario(0, new ArrayList<Integer>(Arrays.asList(0, 1))));
        c1.addHorario(new Horario(4, new ArrayList<Integer>(Arrays.asList(4, 5)))); // Horario que choca 1
        m1.setCurso(c1);
        Curso c2 = new Curso(m1, "B");
        c2.addHorario(new Horario(1, new ArrayList<Integer>(Arrays.asList(0, 1))));
        c2.addHorario(new Horario(4, new ArrayList<Integer>(Arrays.asList(3, 4)))); // Horario que choca 2
        m1.setCurso(c2);
        Curso c3 = new Curso(m2, "A");
        c3.addHorario(new Horario(2, new ArrayList<Integer>(Arrays.asList(10, 11))));
        c3.addHorario(new Horario(5, new ArrayList<Integer>(Arrays.asList(6, 7))));
        m2.setCurso(c3);
        Curso c4 = new Curso(m2, "B");
        c4.addHorario(new Horario(3, new ArrayList<Integer>(Arrays.asList(0, 1))));
        c4.addHorario(new Horario(0, new ArrayList<Integer>(Arrays.asList(2, 3, 4))));
        m2.setCurso(c4);
        Curso c5 = new Curso(m3, "A");
        c5.addHorario(new Horario(2, new ArrayList<Integer>(Arrays.asList(3, 4, 5))));
        c5.addHorario(new Horario(4, new ArrayList<Integer>(Arrays.asList(6, 7))));
        m3.setCurso(c5);
        //Caso de prueba
        Estudiante estudiante = new Estudiante("Jaime", "Guevara");
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
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                matrizHorarios[i][j] = 0;
            }
        }
        int exitoPrograma=0;
        do {
            System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            System.out.println("SERVICIOS ESTUDIANTILES");
            System.out.println("1. Visualización de notas");
            System.out.println("2. Matriculación");
            System.out.print("Seleccione un servicio: ");
            opServicio = entrada.nextInt();
            entrada.skip("\n");
            switch (opServicio) {
                case 1:
                    break;
                case 2:
                    int exitoDeMatricula = 0;
                    do {
                        estudiante.visualizador.mostrarMateriasDisponibles(estudiante);
                        System.out.print("Seleccione una materia: (Presione -1 para salir.)");
                        opMateria = entrada.nextInt();
                        entrada.skip("\n");
                        if (opMateria != -1) {
                            materiaAux = estudiante.visualizador.getMateriasDisponibles().get(opMateria - 1);
                            estudiante.visualizador.mostrarHorariosDeMateria(materiaAux);
                            System.out.print("Seleccione un curso: ");
                            opCurso = entrada.nextInt();
                            estudiante.visualizador.getHorariosDeMateria().get(opCurso - 1);
                            System.out.println("Opcurso -1:"+opCurso);
                            while (estaOcupadoHorario(estudiante.visualizador.getHorariosDeMateria().get(opCurso - 1), matrizHorarios)&&opCurso!=-1) {
                                int numeroDelDiaOcupado = puestoOcupadoHorario(estudiante.visualizador.getHorariosDeMateria().get(opCurso - 1), matrizHorarios)[0];
                                int horaDelDiaOcupado = puestoOcupadoHorario(estudiante.visualizador.getHorariosDeMateria().get(opCurso - 1), matrizHorarios)[1];
                                System.out.println("Cruce de Horarios con " +
                                        String.valueOf(estudiante.visualizador.getMateriasDisponibles().get(matrizHorarios[horaDelDiaOcupado][numeroDelDiaOcupado])));
                                estudiante.visualizador.mostrarHorariosDeMateria(materiaAux);
                                System.out.print("Seleccione un curso:(Presione -1 para salir.) ");
                                opCurso = entrada.nextInt();
                            }
                            if(opCurso!=-1) {
                                registrarMateria(estudiante.visualizador.getHorariosDeMateria().get(opCurso - 1), matrizHorarios, opMateria);
                                System.out.println("Materia Registrada Satisfactoriamente.");
                                //imprimirMatriz(matrizHorarios);
                                entrada.skip("\n");
                            }
                        }else {
                            System.out.println("Matricula Finalizada");
                            exitoDeMatricula = 1;
                            break;
                        }
                    } while (exitoDeMatricula == 0);
                    break;
                case -1:
                    exitoPrograma=1;
                    System.out.println("Finalizando Sistema De Matriculacion");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    break;
            }
        }while (exitoPrograma==0);
    }
}

