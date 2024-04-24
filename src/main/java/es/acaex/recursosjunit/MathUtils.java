package es.acaex.recursosjunit;

public class MathUtils {

    public int suma(int i, int j) {
        return i + j;
    }

    public void lanzarExcepcion() {
        throw new NullPointerException("Prueba");
    }

    public boolean isPrime(int numberToCheck) {
        if (numberToCheck <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
