package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
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

}
