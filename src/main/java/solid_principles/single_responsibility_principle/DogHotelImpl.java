package solid_principles.single_responsibility_principle;

public class DogHotelImpl implements DogHotel {
    private int balance;
    @Override
    public void washTheDog() {
        System.out.println("Собака помыта");
        setBalance(getBalance() + 100);
    }

    @Override
    public void giveSomeEat() {
        System.out.println("Собака поела");
        setBalance(getBalance() + 50);    }

    @Override
    public void healTheDog() {
        System.out.println("Собака вылечена");
        setBalance(getBalance() + 500);    }

    @Override
    public String makeReport(int balance) {
        Double tax = balance*0.13;
        return "Общая прибыль составляет " + balance + " в том числе подоходный налог: " + tax;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
