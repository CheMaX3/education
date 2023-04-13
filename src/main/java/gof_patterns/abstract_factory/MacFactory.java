package gof_patterns.abstract_factory;

public class MacFactory extends AbstractFactoryImpl {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
