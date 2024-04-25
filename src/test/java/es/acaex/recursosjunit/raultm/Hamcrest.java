package es.acaex.recursosjunit.raultm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import es.acaex.recursosjunit.MathUtils;

public class Hamcrest {
    
    MathUtils mathUtils = new MathUtils();

    @Test
    void checkEqualTo(){
        assertThat(mathUtils.suma(2,3), equalTo(5));
    }

    @Test
    void checkIsEqualTo(){
        assertThat(mathUtils.suma(2,3), is(equalTo(5)));
    }

    @Test
    void checkIs(){
        assertThat(mathUtils.suma(2,3), is(5));
    }
    
    @Test
    void checkIsNotEqualTo(){
        assertThat(mathUtils.suma(2,3), not(is(equalTo(4))));
        assertThat(mathUtils.suma(2,3), is(not(equalTo(4))));
    }
    
    @Test
    void startsWithExample(){
        assertThat("cadena", startsWith("cad"));
    }

    @Test
    void notStartsWithExample(){
        assertThat("cadena", not(startsWith("dac")));
    }

    @Test
    void endsWithExample(){
        assertThat("cadena", endsWith("ena"));
    }

    @Test
    void containsExample(){
        assertThat("cadena", containsString("den"));
    }

    @Test
    void greaterThanExample(){
        assertThat(7, greaterThan(6));
    }

    @Test
    void lessThanExample(){
        assertThat(7, lessThan(8));
    }

    @Test
    void nullExample(){
        assertThat(null, nullValue());
    }

    @Test
    void notNullExample(){
        assertThat("cadena", notNullValue());
    }

    @Test
    void hasPropertyExample(){
        assertThat(new Persona(), hasProperty("nombre", is("Alfonso")));
    }

    public class Persona {
        public String nombre = "Alfonso";

        public String getNombre(){ return nombre; }
    }
}

