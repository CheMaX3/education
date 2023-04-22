package solid_principles.interface_segregation_principle;

public class Alabai implements DogDryFeedEatter, DogMeatEatter {


    @Override
    public String eatTheMeat() {
       return "Алабай сожрал мясо";
    }

    @Override
    public String eatTheDryFeed() {
        return "Алабай сожрал сухой корм";
    }
}
