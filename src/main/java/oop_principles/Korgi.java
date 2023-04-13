package oop_principles;

import java.util.Objects;
import java.util.Optional;

public class Korgi implements Dog {



    private String breed;
    private String voice;

    static {
        System.out.println(123);
    }



    public Korgi() {
        this.breed = "Korgi";
        this.voice = "Тяф-тяф";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }


    public String getBreed() {
        return breed;
    }

//    @Override
//    public String getUser(String user) throws Exception {
//        return Optional.of(user).orElseThrow(Exception::new);
//
//    }

//    @Override
//    public String getName(String name) {
//        throw new RuntimeException();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korgi korgi = (Korgi) o;
        return Objects.equals(breed, korgi.breed) && Objects.equals(voice, korgi.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, voice);
    }

    @Override
    public String toString() {
        return "Korgi{" +
                "breed='" + breed + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
