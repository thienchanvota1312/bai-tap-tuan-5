package Tuan_5;

public class ExpressionTest extends Expression{
    public String toString() {
        return " ((((10) ^ 2 + -3) + (4 * 3))) ^ 2 ";
    }

    public double evaluate() {
        return ((((10 * 10) + -3) + (4 * 3))) * ((((10 * 10) + -3) + (4 * 3)));
    }
}
