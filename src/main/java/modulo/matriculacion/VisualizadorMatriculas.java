package modulo.matriculacion;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class VisualizadorMatriculas {
    ArrayList<Materia> materiasDisponibles = new ArrayList<>();

    public ArrayList<Materia> getMateriasDisponibles() {
        return materiasDisponibles;
    }

    public void mostrarMateriasDisponibles(Estudiante estudiante){

        System.out.printf("%-20s","Materias");
        System.out.println();
        int indice=1;
        System.out.println("Segunda Matricula");
        for (Materia materia:estudiante.getCurriculum().obtenerMateriasReprobadas(estudiante)){
            System.out.println(indice+"."+" "+materia.getNombre());
            materiasDisponibles.add(materia);
            indice++;
        }
        System.out.println("Materias Disponibles");
        for (Materia materia:
        estudiante.getCarrera().obtenerMateriasSinAprobar(estudiante)) {
            if(!materia.isSegundaMatricula()){
                System.out.println(indice+"."+" "+materia.getNombre());
                materiasDisponibles.add(materia);
            }
            indice++;
        }
    }

    public void mostrarHorariosDeMateria(Materia materia){

    }
}
