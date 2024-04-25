package es.acaex.recursosjunit.raultm;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AssertionsTest.class, InicioJUnitTest.class })
public class SuiteClasesTest {
    // No es necesario definir métodos de prueba aquíç
    // mvn test -Dtest=SuiteClasesTest
}
