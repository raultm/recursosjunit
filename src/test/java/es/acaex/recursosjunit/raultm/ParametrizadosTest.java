package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import es.acaex.recursosjunit.MathUtils;

public class ParametrizadosTest {
    
    MathUtils mathUtils;

    @BeforeEach
    void setUp(){
        mathUtils = new MathUtils();
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 7, 29, 67, 89 })
    void checkValueSource(int numberToCheck){
        assertTrue(mathUtils.isPrime(numberToCheck));
    }

    @ParameterizedTest
    @MethodSource("sumas")
    void checkMethodSource(int sum1, int sum2, int sumTotal){
        assertEquals(sumTotal, mathUtils.suma(sum1, sum2));
    }

    static Stream<Arguments> sumas(){
        return Stream.of(
            Arguments.of(2, 3, 5),
            Arguments.of(5, 7, 12),
            Arguments.of(-3, 8, 5)
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/datos-descuento.csv", numLinesToSkip = 1)
    void testCalcularDescuento(double precioOriginal, int porcentajeDescuento, double precioEsperado) {
        
        double precioCalculado = mathUtils.calcularDescuento(precioOriginal, porcentajeDescuento);
        
        assertEquals(precioEsperado, precioCalculado, 0.001); // Se usa un margen de error de 0.001
    }

}
