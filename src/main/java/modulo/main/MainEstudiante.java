package modulo.main;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Estudiante;
import modulo.matriculas.Carrera;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcionEst = 0;
        Estudiante estudiante = new Estudiante("Jaime","Guevara");
        Carrera carrera = new Carrera("Ingenieria de Software");

        ArrayList<Curso> cursosInscritos = new ArrayList<Curso>();
        int[][] matrizHorarios = new int[12][6];

        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("SERVICIOS ESTUDIANTILES");
        System.out.println("1. Visualización de notas");
        System.out.println("2. Matriculación");
        System.out.print("Seleccione un servicio: ");
        opcionEst = entrada.nextInt();
        entrada.skip("\n");
        switch(opcionEst){
            case 1:
                break;
            case 2:

                break;
            default:
                break;
        }
    }
}

