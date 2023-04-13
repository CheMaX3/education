package solid_principles.single_responsibility_principle;

public class Main {
    public static void main(String[] args) {
        DogHotelImpl hotel = new DogHotelImpl();
        hotel.healTheDog();
        hotel.washTheDog();
        hotel.giveSomeEat();
        System.out.println(hotel.makeReport(hotel.getBalance()));
    }
}
