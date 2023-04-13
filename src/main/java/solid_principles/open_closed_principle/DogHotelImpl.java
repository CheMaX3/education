package solid_principles.open_closed_principle;

public class DogHotelImpl implements DogHotel {

    @Override
    public void washTheDog() {
        System.out.println("Собака помыта");
    }

    @Override
    public void giveSomeEat() {
        System.out.println("Собака поела");
  }

    @Override
    public void healTheDog() {
        System.out.println("Собака вылечена");
    }
}
