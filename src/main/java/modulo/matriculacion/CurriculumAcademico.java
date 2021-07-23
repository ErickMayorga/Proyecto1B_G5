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

    public boolean registrarSuficienciaIngles(){
        return true;
    }

    public void cambiarEstadoMateriaReprobada(Materia materia){

    }

    public ArrayList<Materia> obtenerMateriasReprobadas(Estudiante estudiante){
        ArrayList<Materia> materiasReprobadas = new ArrayList<>();

        return this.materiasIncritas;
    }
    public ArrayList<Materia> getMateriasIncritas(){
        return materiasIncritas;
    }

    public void addMateriaInscrita(Materia materia){
        materiasIncritas.add(materia);
    }

}
