package solid_principles.interface_segregation_principle;

public class Sheepdog implements Dog {
    @Override
    public String eatTheMeat() {
        return "Овчарка сожрала мясо";
    }

    @Override
    public String eatTheDryFeed() {
        return "Овчарка сожрала сухой корм";
    }
}
