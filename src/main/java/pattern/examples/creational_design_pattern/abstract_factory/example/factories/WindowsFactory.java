package pattern.examples.creational_design_pattern.abstract_factory.example.factories;

import pattern.examples.creational_design_pattern.abstract_factory.example.buttons.Button;
import pattern.examples.creational_design_pattern.abstract_factory.example.buttons.WindowsButton;
import pattern.examples.creational_design_pattern.abstract_factory.example.checkboxes.CheckBox;
import pattern.examples.creational_design_pattern.abstract_factory.example.checkboxes.WindowsCheckBox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
