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

    public double calcularDescuento(double precioOriginal, double porcentajeDescuento) {
        // 100 y un descuento del 10% => 100*0.90 = 90. 1-(10/100)
        return precioOriginal * (1 - (porcentajeDescuento/100));
    }
    
}
