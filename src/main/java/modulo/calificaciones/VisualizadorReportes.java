package modulo.calificaciones;

public class VisualizadorReportes {
    private GestorCursos gestorCursos;

    public VisualizadorReportes(GestorCursos gestor) {
        gestorCursos = gestor;
    }
    public GestorCursos getGestorCursos() {
        return gestorCursos;
    }

    public void mostrarCursosAsignados(Profesor profesor){
        int indice =1;
        System.out.println("Cursos Asignados:");
        System.out.println("Materia \t\t Paralelo");
        System.out.println("-------------------------------------------------");
        this.gestorCursos.listarCursosAsignados(indice, profesor);
        System.out.println(indice + ". Salir");
    }

    public void mostrarListaEstudiantesDeCurso(Curso curso){
        System.out.println("Lista de Estudiantes");
        int indice=1;
        System.out.println("Nombre \t\t\t Calificaciones");
        System.out.println("-------------------------------------------------");
        indice = gestorCursos.listarEstudiantesDeCurso(curso, indice, this);

        System.out.println(indice + ". Salir");
    }

    public void agregarCalificacion(Curso curso, Estudiante estudiante, int opcion, Calificacion calificacion, Profesor profesor){
        if(opcion>0 && opcion<4){
            for(Curso a: getGestorCursos().obtenerCursosAsignados(profesor)) {
                if (a.equals(curso)) {
                    a.asignarCalificaciónEstudiante(estudiante, opcion, calificacion);
                }
            }
        }else
            System.out.println("La opcion ingresada no es valida");
    }

    public void modificarCalificacion(Curso curso, Estudiante estudiante, int opcion, Calificacion calNueva, Profesor profesor){
        agregarCalificacion(curso,estudiante,opcion,calNueva, profesor);
    }
}
