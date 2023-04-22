package solid_principles.open_closed_principle;

public class DogTrainerImpl implements DogTrainer {

    private String name;
    private Dog dog;

    public DogTrainerImpl(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

  public void changeTheDog(Dog newDog) {
        this.dog = newDog;
  }

    @Override
    public void trainVoice() {
        this.dog.getVoice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
