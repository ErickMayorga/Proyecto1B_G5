package modulo.matriculacion;

import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class CurriculumAcademico {
    private ArrayList<Materia> materiasIncritas =  new ArrayList<>();
    private IPlataformaIdiomaExtranjero plataforma;
    private boolean suficienciaIngles;

    public CurriculumAcademico() {
    }

    public CurriculumAcademico(IPlataformaIdiomaExtranjero plataforma) {
        this.plataforma = plataforma;
    }

    public boolean registrarSuficienciaIngles(Estudiante estudiante){

        return plataforma.verificarSuficienciaIngles(estudiante);
    }

    public void cambiarEstadoMateriaReprobada(Materia materia){

    }

    public ArrayList<Materia> obtenerMateriasReprobadas(Estudiante estudiante){
        ArrayList<Materia> materiasReprobadas = new ArrayList<Materia>();
        for (Materia materia:
             estudiante.getCarrera().getMaterias()) {
            if(materia.isSegundaMatricula()){
                materiasReprobadas.add(materia);
            }
        }
        return materiasReprobadas;
    }
    public ArrayList<Materia> getMateriasIncritas(){
        return materiasIncritas;
    }

    public void addMateriaInscrita(Materia materia){
        materiasIncritas.add(materia);
    }

}
