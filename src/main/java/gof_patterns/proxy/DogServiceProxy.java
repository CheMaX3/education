package gof_patterns.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DogServiceProxy extends DogService {

    public DogServiceProxy() {
        super();
    }
    private List<String> methodNames = new ArrayList<>();

    public boolean annotationCheck(Method[] methods) {
        boolean isAnnotated = false;
        for (Method method : methods) {
            System.out.println(method);
            if (method.isAnnotationPresent(MyCache.class)) {
                isAnnotated = true;
                break;
            }
        }
        return isAnnotated;
    }

    public List<Dog> getDogs() throws InvocationTargetException, IllegalAccessException {
        Method[] methods = DogService.class.getMethods();
        List<Dog> dogs = new ArrayList<>();
        if (annotationCheck(methods)) {
            System.out.println("Вызов через прокси");
            dogs = super.getDogs();
        } else {
            System.out.println("Вызов не через прокси");
        }
        return dogs;
    }
}
