package other;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTasks {
    public static void main(String[] args) {
        Set<Object> setString = new HashSet<>();
        setString.add(1);
        setString.add("slovo");
        setString.add("slovo");
        setString.add(new Object());
        setString.add(new Object());
        System.out.println(setString.size());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
