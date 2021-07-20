package modulo.matriculas;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class PagoTest {
    Pago pago=null;
    Arancel arancel;
    Matricula matricula;
    double expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{new Arancel(2150.3),new Matricula(512.6),2150.3+512.6});
        objects.add(new Object[]{new Arancel(1130.1),new Matricula(210.6),1130.1+210.6});
        objects.add(new Object[]{new Arancel(3100),new Matricula(100.5),3100+100.5});
        return objects;
    }

    @Before
    public void setUp(){
        pago= new Pago(new Arancel(0),new Matricula(0));
    }

    public PagoTest(Arancel arancel, Matricula matricula, double expected) {
        this.matricula = matricula;
        this.arancel = arancel;
        this.expected = expected;
    }

    @Test
    public void given_arancel_and_matricula_when_calcularPago_is_ok(){
        pago.setArancel(arancel);
        pago.setMatricula(matricula);
        double actual = pago.calcularValorPago();
        assertEquals(expected,actual,Math.abs(expected-actual));
    }
}