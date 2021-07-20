package modulo.calificaciones;

import modulo.matriculas.IGeneradorPago;
import modulo.matriculas.Pago;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class EstudianteTest {

    Estudiante estudiante;
    IGeneradorPago generadorPago;

    @Before
    public void setUp(){
        estudiante = new Estudiante("Mario","Castro");
        generadorPago = Mockito.mock(IGeneradorPago.class);
        estudiante.setPago(new Pago(generadorPago));
    }

    @Test
    public void give_pago_when_is_correct_then_ok(){
        Mockito.when(generadorPago.realizarSolicitudPago(Mockito.any())).thenReturn(1);
        assertTrue(estudiante.pagarMatricula());
    }

    @Test
    public void give_pago_when_is_correct_then_error(){
        Mockito.when(generadorPago.realizarSolicitudPago(Mockito.any())).thenReturn(2);
        assertFalse(estudiante.pagarMatricula());
    }
}