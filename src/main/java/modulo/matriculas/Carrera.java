package modulo.matriculas;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private int numHoras;
    private int numSemestre;
    private ArrayList<Materia> materias;

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Carrera(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia){
        materias.add(materia);
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public ArrayList<Materia> obtenerMateriasSinAprobar(Estudiante estudiante){
        ArrayList<Materia> materiasSinAprobar = new ArrayList<>();
        return materiasSinAprobar;
    }
}
