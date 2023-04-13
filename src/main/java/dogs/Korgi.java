package dogs;

import java.util.Objects;

public class Korgi implements Dog {
    private String name;
    private String age;

    public Korgi() {

    }

    public Korgi(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korgi korgi = (Korgi) o;
        return Objects.equals(name, korgi.name) && Objects.equals(age, korgi.age);
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
        return "Korgi{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
