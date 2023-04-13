package gof_patterns.abstract_factory;

public abstract class AbstractFactoryImpl implements AbstractFactory {
    public abstract Window createWindow();
    public abstract Button createButton();
}
