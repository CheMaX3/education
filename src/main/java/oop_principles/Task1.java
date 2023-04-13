package oop_principles;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;

public class Task1 {
    public static void main(String[] args) {
        Alabai alabai = new Alabai();
        String alabaiVoice = alabai.getVoice();
        System.out.println("Я гавкаю так " + alabaiVoice);

        Korgi korgi = new Korgi();
        Field[] fields = korgi.getClass().getFields();
        for (Field s : fields) {
            System.out.println(s);
        }
//        try {
//            korgi.getName("Vasya");
//        } catch (NoSuchElementException ex) {
//            System.out.println("No name");
//        }
//
//        try {
//            korgi.getUser(null);
//        } catch (Exception ex) {
//            System.out.println("No user");
//        }


        StringBuilder builder = new StringBuilder();
        builder.append("My ").append("name ").append("is Maxim");
        builder.append(" My age is ").append(32);
        System.out.println(builder);

        String s1 = "g";
        String s2 = "g";
        System.out.println(s1.equals(s2));

        String korgiVoice = korgi.getVoice();
        String korgiBreed = korgi.getBreed();
        System.out.println("Я - " + korgiBreed + " я гавкаю так " + korgiVoice);

//        List<Dog> dogList = new ArrayList<>();
//        Dog alabai1 = new Alabai("1", "voice1");
//        Dog alabai2 = new Alabai("1", "voice1");
//        dogList.add(alabai1);
//        dogList.add(alabai2);

//        System.out.println(alabai1.equals(alabai2));
//        System.out.println(alabai1.hashCode());
//        System.out.println(alabai2.hashCode());
//        for (Dog dog: dogList) {
//            System.out.println("Я - " + dog.getBreed() + " я гавкаю так " + dog.getVoice());
//        }
//
//        dogList.forEach(dog -> System.out.println("Я - " + dog.getBreed() + " я гавкаю так " + dog.getVoice()));
//
//
//        getDog(new Alabai());
//        getDog(new Korgi());
//    }
//
//    private static void getDog(Dog dog) {
//        System.out.println("Я - " + dog.getBreed() + " я гавкаю так " + dog.getVoice());
//    }
    }
}
