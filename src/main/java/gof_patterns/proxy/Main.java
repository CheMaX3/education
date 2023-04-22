package gof_patterns.proxy;


import java.lang.reflect.InvocationTargetException;

public class Main {

    private static final DogServiceProxy dogService = new DogServiceProxy();

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println(dogService.getDogs());
    }
}
