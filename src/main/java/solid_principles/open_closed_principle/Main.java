package solid_principles.open_closed_principle;

public class Main {
    public static void main(String[] args) {
        DogHotel hotel = new DogHotelImpl();
        hotel.giveSomeEat();
        hotel = new DogHotelImplWithWalking();
        hotel.giveSomeEat();
    }
}
