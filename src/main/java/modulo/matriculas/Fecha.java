package modulo.matriculas;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int year;
    /*Este metodo lo cree para comparar la fecha de Pago con la Fecha actual y si el plazo esta vencido
    * se cancela la matricula*/
    public boolean compararConFechaActual() {
        int[] fechaActualyyyymmdd = new int[3];
        String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String[] fechaActualSplitted = fechaActual.split("/");
        for (int i = 0; i < fechaActualSplitted.length; i++) {
            fechaActualyyyymmdd[i] = Integer.valueOf(fechaActualSplitted[i]);
        }
        if (this.year < fechaActualyyyymmdd[0]) {
            return false;
        }
        if (this.year == fechaActualyyyymmdd[0]) {
            if (this.mes < fechaActualyyyymmdd[1]) {
                return false;
            }
            if (this.mes == fechaActualyyyymmdd[1]) {
                if (this.dia < fechaActualyyyymmdd[2]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean validarFecha(){
        return true;
    }

}
