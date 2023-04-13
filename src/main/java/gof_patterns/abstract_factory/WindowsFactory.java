package gof_patterns.abstract_factory;

public class WindowsFactory extends AbstractFactoryImpl {
    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
