package dogs;

import java.util.Objects;

public class Alabai implements Dog {
    private String name;
    private String age;

    public Alabai() {


    }

    public Alabai(String name, String age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Alabai) {
//            Alabai alabai = (Alabai) obj;
//            return this.name.equals(alabai.name) && this.age.equals(alabai.age);
//        }
//        Dog dog = (Dog) obj;
//        return (dog.length() != name.length());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alabai alabai = (Alabai) o;
        return Objects.equals(name, alabai.name) && Objects.equals(age, alabai.age);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public int length() {
        return name.length();
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
