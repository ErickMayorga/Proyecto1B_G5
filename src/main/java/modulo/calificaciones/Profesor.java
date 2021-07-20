package modulo.calificaciones;

public class Profesor {
    private String nombre;
    private String apellido;
    private String nivelEducacion;
    public VisualizadorReportes visualizador;

    public Profesor(String nombre, String apellido, String nivelEducacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelEducacion = nivelEducacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void listarCursosAsignados(){
        visualizador.mostrarCursosAsignados(this);
    }

    public void listarEstudiantes(Curso curso){
        visualizador.mostrarListaEstudiantesDeCurso(curso);
    }
}
