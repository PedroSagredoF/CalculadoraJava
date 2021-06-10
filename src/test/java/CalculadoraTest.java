import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();


    @Test
    void testAdd() {
        Assertions.assertAll(()-> assertEquals(6,calc.add(3,3)),
                             ()-> assertEquals(18,calc.add(10,8)),
                             ()-> assertEquals(2,calc.add(1.2f,0.8f))
        );
    }

    @Test
    void testRes() {
        Assertions.assertAll(() -> assertEquals(0,calc.res(3,3)),
                             () -> assertEquals(5,calc.res(8,3)),
                             () -> assertEquals(2,calc.res(2.5f,0.5f))
        );
    }

    @Test
    void testMul() {
        Assertions.assertAll(() -> assertEquals(6,calc.mul(2,3)),
                             () -> assertEquals(9,calc.mul(3,3)),
                             () -> assertEquals(90,calc.mul(100,0.9f))
        );
    }

    @Test
    void testDiv() {
        Assertions.assertAll(() -> assertEquals(6,calc.div(18,3)),
                             () -> assertEquals(7,calc.div(21,3)),
                             () -> assertEquals(10,calc.div(1,0.1f))
        );
    }
}