package es.acaex.recursosjunit.raultm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.acaex.recursosjunit.MathUtils;

class AssertionsTest {
    
    MathUtils mathUtils = new MathUtils();
    
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test 
    void checkAssertEquals() {
        assertEquals(5, mathUtils.suma(2, 3));
    }

    @Test
    void checkAssertNotEquals(){
        assertNotEquals(6, mathUtils.suma(2, 2));
    }

    @Test 
    void checkAssertTrue(){
        assertTrue(true);
    }

    @Test 
    void checkAssertFalse(){
        assertFalse(false);
    }

    @Test
    void checkAssertNull(){
        assertNull(null);
    }

    @Test
    void checkAssertNotNull(){
        assertNotNull(mathUtils);
    }

    @Test
    void checkAssertThrows(){
        Exception ex = assertThrows(NullPointerException.class, () -> mathUtils.lanzarExcepcion());
        assertEquals("Prueba", ex.getMessage());
    }

    @Test
    void checkAssertNotThrows(){
        assertDoesNotThrow(() -> mathUtils.suma(4,4));
    }

}
