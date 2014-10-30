package CalculationAlgorithms;

/**
 * Rekursive Berechnung von Fibonacci-Zahlen
 * @author Patrick Vogt
 * @see CalculationAlgorithms.Fibonacci
 */
public class FibRecursive extends Fibonacci {

    /**
     * Rekursive Berechnung der n-ten Fibonacci-Zahl
     * @param n Zu berechnende Fibonacci-Zahl
     * @return n-te Fibonacci-Zahl
     */
    public int calculate(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return n;
        else
            return this.calculate(n - 1) + this.calculate(n - 2);
    }

}
