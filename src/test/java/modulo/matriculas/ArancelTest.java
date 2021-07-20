package modulo.matriculas;

import modulo.calificaciones.Estudiante;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ArancelTest {
    Beca beca;
    Arancel arancel;
    double valorArancel;
    Estudiante estudiante;
    double expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{2120.4, new Beca(0.6),2120.4*0.4});
        objects.add(new Object[]{2120.4, new Beca(0.8),2120.4*0.2});
        objects.add(new Object[]{2120.4, new Beca(0.5),2120.4*0.5});
        return objects;
    }

    public ArancelTest(double valorArancel, Beca beca, double expected) {
        this.beca = beca;
        this.valorArancel = valorArancel;
        this.expected = expected;
    }

    @Before
    public void setUp(){
        arancel = new Arancel(0);
        estudiante = new Estudiante("Jimena","Vega");
    }

    @Test
    public void given_beca_and_arancel_when_calcularValorArancel_is_ok(){
        arancel.setValor(valorArancel);
        arancel.setBeca(beca);
        estudiante.setBeca(true);
        double actual = arancel.calcularValorArancel(estudiante);
        assertEquals(expected,actual,Math.abs(expected-actual));
    }
}