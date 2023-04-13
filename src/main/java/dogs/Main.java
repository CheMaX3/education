package dogs;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Alabai alabai = new Alabai("Alabai", "2");
        Alabai alabai2 = new Alabai("Alabai", "2");
        Korgi korgi = new Korgi("Korgi", "3");
        System.out.println(alabai.equals(korgi));

        Map<Dog, String> dogs = new HashMap<>();

        dogs.put(alabai, "1");
        dogs.put(korgi, "1");
//        dogs.put(alabai2, "2");
        System.out.println(dogs);
    }
}
