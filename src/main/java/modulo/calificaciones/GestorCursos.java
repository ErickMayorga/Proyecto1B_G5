package modulo.calificaciones;

import java.util.ArrayList;

public class GestorCursos {
    private ListaCursos listaCursos;

    public GestorCursos(ListaCursos listaCursos) {
        this.listaCursos = listaCursos;
    }

    public ArrayList<Curso> obtenerCursosAsignados(Profesor profesor){
        ArrayList<Curso> cursosAsignados = new ArrayList<>();
        listaCursos.enlazarCursoProfesor(profesor,cursosAsignados);
        return cursosAsignados;
    }
    public void listarCursosAsignados(int indice, Profesor profesor){
        for(Curso a: this.obtenerCursosAsignados(profesor)){
            System.out.println(indice + ". " + a.getMateria().getNombre() + "\t \"" + a.getParalelo() + "\"");
            indice++;
        }
    }

    int listarEstudiantesDeCurso(Curso curso, int indice, VisualizadorReportes visualizadorReportes) {
        for(Curso c: obtenerCursosAsignados(curso.getProfesor())){
            if(c.equals(curso)){
                for(Estudiante e: c.obtenerListaEstudiantes()){
                    System.out.print(indice + ". " + e.toString());
                    indice++;
                }
            }
        }
        return indice;
    }
}
