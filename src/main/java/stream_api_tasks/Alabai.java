package stream_api_tasks;

public class Alabai implements Dog {

    private String voice;
    private String breed;
    private String human;
    private int age;

    public Alabai() {
    }

    public Alabai(String voice, String breed, String human, int age) {
        this.voice = voice;
        this.breed = breed;
        this.human = human;
        this.age = age;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getHuman() {
        return human;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "voice='" + voice + '\'' +
                ", breed='" + breed + '\'' +
                ", human='" + human + '\'' +
                ", age=" + age +
                '}';
    }
}




//TODO:где ещё используется hashCode() кроме hashMap

//TODO:SOLID, паттерны проектирования proxy, decorator, fabrica, adapter, Singleton Observer
