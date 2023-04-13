package gof_patterns.fabric_method_or_virtual_constructor;

public class Creator2 extends AbstractClass {
    @Override
    public Parent createParent() {
        return new Child2();
    }
}
