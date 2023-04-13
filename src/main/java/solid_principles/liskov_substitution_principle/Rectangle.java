package solid_principles.liskov_substitution_principle;

public class Rectangle {

    private int a;
    private int b;

    public double getSquare() {
        return this.a * this.b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
