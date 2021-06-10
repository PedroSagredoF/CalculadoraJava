import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();


    @Test
    void testAdd() {
        assertEquals(6,calc.add(3,3));
    }

    @Test
    void testRes() {
        assertEquals(0,calc.res(3,3));
    }

    @Test
    void testMul() {
        assertEquals(6,calc.mul(2,3));
    }

    @Test
    void testDiv() {
        assertEquals(6,calc.div(18,3));
    }
}