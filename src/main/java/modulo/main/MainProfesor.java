package modulo.main;

import modulo.calificaciones.*;

import java.util.Scanner;


public class MainProfesor {

    public static void main(String[] args) {
        //Materias registradas
        Materia m1 = new Materia("Programación");
        Materia m2 = new Materia("Bases de Datos");
        Materia m3 = new Materia("Metologías Ágiles");

        //Cursos registrados
        Curso c1 = new Curso(m1,"A");
        Curso c2 = new Curso(m1,"B");
        Curso c3 = new Curso(m1,"C");
        Curso c4 = new Curso(m1,"D");
        Curso c5 = new Curso(m2,"A");
        Curso c6 = new Curso(m2,"B");
        Curso c7 = new Curso(m2,"C");
        Curso c8 = new Curso(m2,"D");
        Curso c9 = new Curso(m3,"A");
        Curso c10 = new Curso(m3,"B");
        Curso c11= new Curso(m3,"C");
        Curso c12 = new Curso(m3,"D");

        //Lista de cursos de la universidad
        ListaCursos cursos = new ListaCursos();
        cursos.agregarCurso(c1);
        cursos.agregarCurso(c2);
        cursos.agregarCurso(c3);
        cursos.agregarCurso(c4);
        cursos.agregarCurso(c5);
        cursos.agregarCurso(c6);
        cursos.agregarCurso(c7);
        cursos.agregarCurso(c8);
        cursos.agregarCurso(c9);
        cursos.agregarCurso(c10);
        cursos.agregarCurso(c11);
        cursos.agregarCurso(c12);

        //Profesores registrados
        Profesor p1 = new Profesor("Adrian","Romero","PhD Sistemas");
        Profesor p2 = new Profesor("Mario","Benavides","PhD Seguridad");

        //Asignacion de profesores
        c1.asignarProfesor(p1);
        c3.asignarProfesor(p1);

        //Estudiantes
        Estudiante estudiante1 = new Estudiante("Jorge","Lopez");
        Estudiante estudiante2 = new Estudiante("Juan","Beltran");
        Estudiante estudiante3 = new Estudiante("Luis","Sandoval");
        Estudiante estudiante4 = new Estudiante("Carlos","Galindo");
        Estudiante estudiante5 = new Estudiante("Ariel","Inguez");
        Estudiante estudiante6 = new Estudiante("Kevin","Angamarca");

        //Asignacion de estudiantes al curso
        c1.obtenerListaEstudiantes().add(estudiante1);
        c1.obtenerListaEstudiantes().add(estudiante2);
        c1.obtenerListaEstudiantes().add(estudiante3);
        c1.obtenerListaEstudiantes().add(estudiante4);
        c3.obtenerListaEstudiantes().add(estudiante5);
        c3.obtenerListaEstudiantes().add(estudiante6);

        //Caso estudiante Jorge Lopez
        Scanner entrada = new Scanner(System.in);
        int opCurso=0, opEstudiante=0, opCalificacion=0, canCursos=0, canEstudiantes=0;
        double calificacion=0;
        Curso cursoAux=null;
        Estudiante estudianteAux = null;
        GestorCursos gestor = new GestorCursos(cursos);
        VisualizadorReportes visualizador =  new VisualizadorReportes(gestor);
        p1.visualizador = visualizador;

        System.out.println("Bienvenido: " + p1.getNombre() + " " + p1.getApellido());
        do {
            p1.listarCursosAsignados();
            System.out.print("Seleccione el número de curso que desea: ");
            opCurso = entrada.nextInt();
            //entrada.skip("\n");

            canCursos = p1.visualizador.getGestorCursos().obtenerCursosAsignados(p1).size();
            if(opCurso>canCursos+1 || opCurso<=0){
                System.out.println("La opcion ingresada es incorrecta");
            }else if(opCurso==canCursos+1){
                break;
            }else{
                cursoAux = p1.visualizador.getGestorCursos().obtenerCursosAsignados(p1).get(opCurso-1);
                System.out.println("\n");
                p1.listarEstudiantes(cursoAux);
                System.out.print("Seleccione un estudiante: ");
                opEstudiante = entrada.nextInt();
                //entrada.skip("\n");
                canEstudiantes = cursoAux.obtenerListaEstudiantes().size();
                if(opEstudiante>canEstudiantes+1 || opEstudiante<=0){
                    System.out.println("La opcion ingresada es incorrecta");
                }else if(opEstudiante==canEstudiantes){
                    break;
                }else{
                    estudianteAux = cursoAux.obtenerListaEstudiantes().get(opEstudiante-1);
                    System.out.println("\n");
                    System.out.println("1. Primer Bimestre");
                    System.out.println("2. Segundo Bimestre");
                    System.out.println("3. Tercer Examen");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una calificacion: ");
                    opCalificacion = entrada.nextInt();
                    //entrada.skip("\n");
                    if(opCalificacion>4 || opCalificacion<=0){
                        System.out.println("La opcion ingresada es incorrecta");
                    }else{
                        Calificacion cal=new Calificacion(-1);
                        do {
                            System.out.print("Ingrese el valor de la calificacion: ");
                            calificacion = entrada.nextDouble();
                            cal.setValorNota(calificacion);
                            //entrada.skip("\n");
                            if(!cal.validarCalificacion(calificacion)){
                                System.out.println("¡¡La nota ingresada no es válida!!\n");
                            }
                        }while(!cal.validarCalificacion(calificacion));

                        p1.visualizador.agregarCalificacion(cursoAux, estudianteAux,opCalificacion,new Calificacion(calificacion), p1);
                        System.out.println("\n");
                        p1.listarEstudiantes(cursoAux);
                        System.out.println("\n");
                    }
                }
            }
        }while(opCurso != canCursos+1 || opEstudiante != canEstudiantes+1 || opCalificacion!= 4);
    }
}
