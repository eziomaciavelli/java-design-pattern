package pattern.creational_design_pattern.abstract_factory.example.factories;

import pattern.creational_design_pattern.abstract_factory.example.buttons.Button;
import pattern.creational_design_pattern.abstract_factory.example.buttons.MacOSButton;
import pattern.creational_design_pattern.abstract_factory.example.checkboxes.CheckBox;
import pattern.creational_design_pattern.abstract_factory.example.checkboxes.MacOSCheckBox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
