package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.acaex.recursosjunit.MathUtils;

public class InicioJUnitTest {
    
    @Test
    public void testSuma() {
        // Arrange
        MathUtils mathUtils = new MathUtils();

        // Act
        int resultado = mathUtils.suma(2, 3);

        // Assert
        assertEquals(5, resultado);
    }
}
