package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.acaex.recursosjunit.MathUtils;

public class AssertionsTest {
    
    MathUtils mathUtils = new MathUtils();
    
    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test 
    public void testSuma() {
        assertEquals(5, mathUtils.suma(2, 3));
    }

}
