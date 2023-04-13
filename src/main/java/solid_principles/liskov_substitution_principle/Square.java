package solid_principles.liskov_substitution_principle;

public class Square extends Rectangle {

    private int a;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

}
