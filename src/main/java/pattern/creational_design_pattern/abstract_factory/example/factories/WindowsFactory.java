package pattern.creational_design_pattern.abstract_factory.example.factories;

import pattern.creational_design_pattern.abstract_factory.example.buttons.Button;
import pattern.creational_design_pattern.abstract_factory.example.buttons.WindowsButton;
import pattern.creational_design_pattern.abstract_factory.example.checkboxes.CheckBox;
import pattern.creational_design_pattern.abstract_factory.example.checkboxes.WindowsCheckBox;

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
