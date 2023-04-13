package stream_api_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Dog alabai = new Alabai("AV-AV","Alabai", "Maxim", 3);
        Dog alabai1 = new Alabai("AV-AV","Alabai", "Vasya", 5);
        Dog korgi = new Korgi("au-au", "Korgi", "Petya", 1);
        Dog korgi1 = new Korgi("au-au", "Korgi", "Alyosha", 10);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(alabai);
        dogs.add(alabai1);
        dogs.add(korgi);
        dogs.add(korgi1);

        for (Dog dog: dogs) {
            if (dog.getAge() > 4) {
                System.out.println(dog);
            }
        }


        dogs.stream().filter(dog -> dog.getAge() > 4).forEach(System.out::println);

        System.out.println();

        for (Dog dog1 : dogs) {
            if (dog1.getHuman().equals("Maxim")) {
                System.out.println(dog1);
            }
        }

        dogs.stream().filter(dog -> dog.getHuman().equals("Maxim")).forEach(System.out::println);

        System.out.println();
//TODO:Вернуть true/false, если Maxim в списке есть
        for (Dog dog1 : dogs) {
            System.out.println(dog1.getHuman().equals("Maxim"));
        }

        dogs.stream().filter(dog -> dog.getHuman().equals("Maxim")).forEach(System.out::println);

        System.out.println();

        dogs.stream().map(dog -> {
            if (dog.getHuman().equals("Alyosha")) {
                return dog.getHuman() + " lox";
            }
            return dog.getHuman();
        })
                .forEach(System.out::println);

    }


}