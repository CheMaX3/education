package solid_principles.interface_segregation_principle;

public class Korgi implements DogDryFeedEatter {

    @Override
    public String eatTheDryFeed() {
        return "Корги сожрала сухой корм";
    }
}
