package gof_patterns.proxy;

public class Alabai implements Dog {
    private String id;
    private String breed;

    public Alabai(String id, String breed) {
        this.id = id;
        this.breed = breed;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "id='" + id + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
