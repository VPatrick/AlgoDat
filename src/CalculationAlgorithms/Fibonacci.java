package CalculationAlgorithms;

/**
 * Berechnet Fibonacci-Zahlen
 * @author Patrick Vogt
 * @see CalculationAlgorithms.IFibonacci
 */
public abstract class Fibonacci implements IFibonacci {

    /**
     * Berechnet die n-te Fibonacci-Zahl
     * @param n Zu berechnende Fibonacci-Zahl
     * @return n-te Fibonacci-Zahl
     */
    public abstract int calculate(int n);

}