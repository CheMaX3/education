package solid_principles.open_closed_principle;

import solid_principles.open_closed_principle.Dog;

public class Alabai implements Dog {

    private String name;
    private Boolean isClean = true;
    private Boolean isIll = false;

    public Alabai(String name, Boolean isClean, Boolean isIll) {
        this.name = name;
        this.isClean = isClean;
        this.isIll = isIll;
    }

    @Override
    public Dog wash() {
        System.out.println("Скребем алабая щёткой");
        this.setClean(true);
        return this;
    }

    @Override
    public Dog heal() {
        System.out.println("Лечим алабая здоровенным уколом");
        this.setIll(false);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClean() {
        return isClean;
    }

    public void setClean(Boolean clean) {
        isClean = clean;
    }

    public Boolean getIll() {
        return isIll;
    }

    public void setIll(Boolean ill) {
        isIll = ill;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "name='" + name + '\'' +
                ", isClean=" + isClean +
                ", isIll=" + isIll +
                '}';
    }
}
