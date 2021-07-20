package modulo.calificaciones;

import java.util.ArrayList;

public class ListaCursos {
    public ArrayList<Curso> cursos;

    public ListaCursos(){
        cursos = new ArrayList<>();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    public void eliminarCurso(Curso curso){
        cursos.remove(curso);
    }

    public void enlazarCursoProfesor(Profesor profesor, ArrayList<Curso> cursosAsignados) {
        for(Curso a:this.getCursos()){
            if(a.getProfesor()!=null && a.getProfesor().equals(profesor)){
                cursosAsignados.add(a);
            }
        }
    }
}
