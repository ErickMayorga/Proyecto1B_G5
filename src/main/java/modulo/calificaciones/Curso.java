package modulo.calificaciones;

import java.util.ArrayList;

public class Curso {
    private String paralelo;
    private Materia materia;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private String horario;

    public Curso(Materia materia, String paralelo){
        this.materia = materia;
        this.paralelo = paralelo;
        estudiantes = new ArrayList<>();
    }

    public String getParalelo() {
        return paralelo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> obtenerListaEstudiantes(){
        return estudiantes;
    }

    void asignarCalificaciónEstudiante(Estudiante estudiante, int opcion, Calificacion calificacion) {
        for (Estudiante e : obtenerListaEstudiantes()) {
            if (e.equals(estudiante)) {
                e.obtenerReporteCalificaciones().registrarCalificacion(calificacion, opcion);
            }
        }
    }
}
