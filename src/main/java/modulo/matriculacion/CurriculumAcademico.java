package modulo.matriculacion;

import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class CurriculumAcademico {
    private ArrayList<Materia> materiasIncritas =  new ArrayList<>();
    private IPlataformaIdiomaExtranjero plataforma;
    private boolean suficienciaIngles;

    public CurriculumAcademico(IPlataformaIdiomaExtranjero plataforma) {
        this.plataforma = plataforma;
    }

    public boolean registrarSuficienciaIngles(){
        return true;
    }

    public ArrayList<Materia> obtenerMateriasReprobadas(){
        ArrayList<Materia> materiasReprobadas = new ArrayList<>();
        return materiasReprobadas;
    }

}
