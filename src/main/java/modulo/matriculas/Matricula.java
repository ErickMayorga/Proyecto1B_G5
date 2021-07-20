package modulo.matriculas;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class Matricula {
    private double valor;
    private ArrayList<Curso> materias = new ArrayList<>();
    private Beca beca;

    public Matricula(double valor) {
        this.valor = valor;
    }

    public double calcularValorMatricula(Estudiante estudiante){
        double calcularPrecioHorasTotales=this.obtenerPrecioTotalDeMaterias();
        if(estudiante.getBeca()){
            calcularPrecioHorasTotales-= beca.calcularDescuentoPorMatricula(calcularPrecioHorasTotales);
        }
        return calcularPrecioHorasTotales;
    }
    public double obtenerPrecioTotalDeMaterias(){
        double precioHorasTotales=0;
        for(int i=0; i<materias.size();i++){
            precioHorasTotales+= materias.get(i).getMateria().getCostoMateriaPorHora()*materias.get(i).getMateria().getNumHoras();
        }
        return precioHorasTotales;
    }

    public Beca getBeca() {
        return beca;
    }

    public void setBeca(Beca beca) {
        this.beca = beca;
    }

    public void addCurso(Curso curso){
        materias.add(curso);
    }

    public ArrayList<Curso> getMaterias() {
        return materias;
    }

    public double getValorMatricula(){
        return valor;
    }
/*Verificar segunda matrícula esta en duda pues si el concepto es para universidad privada entonces no aplica?*/

    public ArrayList<Materia> getMateriasSegundaMatricula(){
        ArrayList<Materia> materiasPerdidas = new ArrayList<>();
        for(Curso m: materias){
            if(m.getMateria().isSegundaMatricula()){
                materiasPerdidas.add(m.getMateria());
            }
        }
        return materiasPerdidas;
    }

    public double calcularRecargoSegundaMatricula(){
        return 0;
    }

}
