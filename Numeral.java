package Tuan_5;

public class Numeral extends Expression{
    private int value;

    public Numeral() {

    }

    public Numeral(int value) {
        this.value = value;
    }

    public String toString() {
        return value + " ";
    }

    public double evaluate() {
        return 0;
    }
}
