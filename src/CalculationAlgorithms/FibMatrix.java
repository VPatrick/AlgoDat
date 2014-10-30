package CalculationAlgorithms;

import java.math.BigInteger;

/**
 * Berechnet Fibonacci-Zahlen mittels Matrix-Multiplikationen
 * @author Patrick Vogt
 * @see CalculationAlgorithms.Fibonacci
 */
public class FibMatrix extends Fibonacci {

    /**
     * Berechnet die n-te Fibonacci-Zahl
     * @param n Zu berechnende Fibonacci-Zahl
     * @return n-te Fibonacci-Zahl
     */
    public int calculate(int n) {
        BigInteger[] matrix = {BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE};
        return (this.pow(matrix, n)[1]).intValue();
    }

    /**
     * Potenzierung durch Quadrierung der Matrix (left shift)
     * @param matrix Basis (Matrix 0 1 1 1)
     * @param n Exponent (zu berechnende Fibonacci-Zahl)
     * @return Potenzierte Matrix
     */
    private BigInteger[] pow( BigInteger[] matrix, int n ) {
        if (n < 0)
            throw new IllegalArgumentException();

        BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
        while (n != 0) {  // Exponentiation by squaring
            if (n % 2 != 0)
                result = this.multiply(matrix, result);

            n /= 2;
            matrix = this.multiply(matrix, matrix);
        }
        return result;
    }

    /**
     * Matrix-Multiplikation
     * @param x Matrix
     * @param y Matrix
     * @return Matrix
     */
    private BigInteger[] multiply(BigInteger[] x, BigInteger[] y) {
        return new BigInteger[] {
                this.multiply(x[0], y[0]).add(this.multiply(x[1], y[2])),
                this.multiply(x[0], y[1]).add(this.multiply(x[1], y[3])),
                this.multiply(x[2], y[0]).add(this.multiply(x[3], y[2])),
                this.multiply(x[2], y[1]).add(this.multiply(x[3], y[3]))
        };
    }

    /**
     * Multiplikation
     * @param x BigInteger
     * @param y BigInteger
     * @return BigInteger
     */
    private BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

}