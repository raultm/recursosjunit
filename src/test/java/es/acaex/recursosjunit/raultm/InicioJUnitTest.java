package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.acaex.recursosjunit.MathUtils;

public class InicioJUnitTest {
    
    MathUtils mathUtils;

    @BeforeAll
    public static void setUpAll(){
        // Configuración inicial de la clase
    }

    @AfterAll
    public static void tearDownAll(){
        // Limpieza después de todas las pruebas
    }

    @BeforeEach
    public void setUp() {
        // Configuración inicial antes de cada prueba
        mathUtils = new MathUtils();
    }

    @AfterEach
    public void tearDown() {
        // Limpieza después de cada prueba
        mathUtils = null;
    }

    @Test
    public void testSuma() {
        int resultado = mathUtils.suma(2, 3);

        assertEquals(5, resultado);
    }
}
