package pattern.examples.creational_design_pattern.abstract_factory.example.app;

import pattern.examples.creational_design_pattern.abstract_factory.example.buttons.Button;
import pattern.examples.creational_design_pattern.abstract_factory.example.checkboxes.CheckBox;
import pattern.examples.creational_design_pattern.abstract_factory.example.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
