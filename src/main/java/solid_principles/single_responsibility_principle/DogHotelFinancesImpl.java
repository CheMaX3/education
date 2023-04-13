package solid_principles.single_responsibility_principle;

public class DogHotelFinancesImpl implements DogHotelFinances {

    private int balance;

    public void washingPayment() {
        setBalance(getBalance() + 100);
    }

    public void eatingPayment() {
        setBalance(getBalance() + 50);
    }

    public void healingPayment() {
        setBalance(getBalance() + 500);
    }

    public String makeReport(int balance) {
        Double tax = balance*0.13;
        return "Общий доход составляет " + balance + " в том числе подоходный налог: " + tax;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
