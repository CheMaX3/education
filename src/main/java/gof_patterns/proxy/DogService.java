package gof_patterns.proxy;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class DogService {

    private String id;
    private String breed;

    public DogService() {
    }

    public DogService(String id, String breed) {
        this.id = id;
        this.breed = breed;
    }

    @MyCache
    public List<Dog> getDogs() throws InvocationTargetException, IllegalAccessException {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Alabai("1", "Alabai1"));
        dogs.add(new Alabai("2", "Alabai2"));
        return dogs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "DogService{" +
                "id='" + id + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
