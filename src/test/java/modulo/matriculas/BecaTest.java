package modulo.matriculas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BecaTest {
    Beca beca;

    @Before
    public void setUp(){
        beca = new Beca(0.6);
    }

    @Test
    public void given_valorArancel_when_descuento_is_ok(){
        double expected = 200*0.6;
        double actual = beca.calcularDescuentoPorArancel(200);
        assertEquals(expected,actual,Math.abs(expected-actual));
    }
}