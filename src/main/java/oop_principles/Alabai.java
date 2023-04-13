package oop_principles;

public class Alabai implements Dog {

    private String voice;

    public Alabai(String voice) {
        this.voice = voice;
    }

    public Alabai() {

    }


    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }
}




//TODO:где ещё используется hashCode() кроме hashMap
