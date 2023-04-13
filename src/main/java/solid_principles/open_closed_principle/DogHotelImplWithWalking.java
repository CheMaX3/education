package solid_principles.open_closed_principle;

public class DogHotelImplWithWalking extends DogHotelImpl {

    @Override
    public void giveSomeEat() {
        System.out.println("Собака поела...");
        System.out.println("...и погуляла");
    }
}
