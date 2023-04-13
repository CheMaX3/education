package oop_principles;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Dog dog = new Alabai("AV-AV");
        System.out.println(dog.getVoice());

        Dog dog1 = new Dog() {
            @Override
            public String getVoice() {
                return "AV-AV-AV";
            }
        };
        System.out.println(dog1.getVoice());
//TODO:попробовать схожие примеры
        Dog dog3 = () -> "av-av-av";
        System.out.println(dog3.getVoice());

        System.out.println(dog.getClass());
        System.out.println(dog1.getClass());
        System.out.println(dog3.getClass());

    }


}
