package solid_principles.open_closed_principle;

public class Dog {

    private String name;
    private String breed;
    private String voice;

    public Dog(String name, String breed, String voice) {
        this.name = name;
        this.breed = breed;
        this.voice = voice;

    }

    public void getVoice() {
        if (breed.equals("Alabai")) {
            System.out.println("Alabai " + this.name + " говорит так: " + this.voice);;
        }
        if (breed.equals("Korgi")) {
            System.out.println("Korgi " + this.name + " говорит так: " + this.voice);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
