package solid_principles.open_closed_principle;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", "Alabai", "AV-AV");
        DogTrainer sergei = new DogTrainerImpl("Sergei", bobik);
        sergei.trainVoice();
        Dog muhtar = new Dog("Muhtar", "Korgi", "тяф-тяф");
        sergei.changeTheDog(muhtar);
        sergei.trainVoice();
        Dog rex = new Dog("Rex","Sheepdog", "GAU-GAU");
        sergei.changeTheDog(rex);
        sergei.trainVoice();
    }
}
