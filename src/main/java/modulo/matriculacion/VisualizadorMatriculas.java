package modulo.matriculacion;

import modulo.calificaciones.Curso;
import modulo.calificaciones.Estudiante;
import modulo.calificaciones.Materia;

import java.util.ArrayList;

public class VisualizadorMatriculas {
    ArrayList<Materia> materiasDisponibles = new ArrayList<Materia>();
    ArrayList<Curso> horariosDeMateria ;
    public ArrayList<Materia> getMateriasDisponibles() {
        return materiasDisponibles;
    }
    public ArrayList<Curso> getHorariosDeMateria(){return horariosDeMateria;}
    public void mostrarMateriasDisponibles(Estudiante estudiante){
        System.out.printf("%-20s","Materias");
        System.out.println();
        int indice=1;
        this.mostrarMateriasReprobadas(estudiante,indice);
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
    public void mostrarMateriasReprobadas(Estudiante estudiante, int indice){
        System.out.println("Segunda Matricula");
        for (Materia materia:estudiante.getCurriculum().obtenerMateriasReprobadas(estudiante)){
            System.out.println(indice+"."+" "+materia.getNombre());
            materiasDisponibles.add(materia);
            indice++;
        }
    }
    public void mostrarHorariosDeMateria(Materia materia){
        this.horariosDeMateria=new ArrayList<Curso>();
        int indice=1;

        for (Curso curso: materia.getCurso()) {
            System.out.println(indice+"."+" "+materia.getNombre()+" Paralelo "+curso.getParalelo());
            for (Horario horario:
                    curso.getHorarios()) {
                System.out.printf("%-15s",transformarNumeroADiaDeSemana(horario.getDiaSemana()));
                System.out.printf("%-5s",this.tranformarNumeroAHorario(horario.getHorasClase()));
                System.out.println("");


            }
            horariosDeMateria.add(curso);
            indice++;
        }

    }

    public String transformarNumeroADiaDeSemana(int numerDeDia) {
        switch (numerDeDia) {
            case 0:
                return "Lunes";
            case 1:
                return "Martes";
            case 2:
                return "Miercoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sabado";
            default:
                return "Dia equivocado";
        }
    }
    public String tranformarNumeroAHorario(ArrayList<Integer> numerosDeHora){
        String horario="";
        switch (numerosDeHora.get(0)){
            case 0:
                 horario+="7-";
                 break;
            case 1:
                horario+="8-";
                break;
            case 2:
                horario+="9-";
                break;
            case 3:
                horario+="10-";
                break;
            case 4:
                horario+="11-";
                break;
            case 5:
                horario+="12-";
            case 6:
                horario+="14-";
                break;
            case 7:
                horario+="15-";
                break;
            case 8:
                horario+="16-";
                break;
            case 9:
                horario+="17-";
                break;
            case 10:
                horario+="18-";
                break;
            case 11:
                horario+="19-";
                break;
            default:
                horario+="No definido";
                break;
        }
        switch (numerosDeHora.get(numerosDeHora.size()-1)){
            case 0:
                horario+="8";
                break;
            case 1:
                horario+="9";
                break;
            case 2:
                horario+="10";
                break;
            case 3:
                horario+="11";
                break;
            case 4:
                horario+="12";
                break;
            case 5:
                horario+="13";
                break;
            case 6:
                horario+="15";
                break;
            case 7:
                horario+="16";
                break;
            case 8:
                horario+="17";
                break;
            case 9:
                horario+="18";
                break;
            case 10:
                horario+="19";
                break;
            case 11:
                horario+="20";
                break;
            default:
                horario+="No definido";
                break;
        }
        return horario;
    }
}

