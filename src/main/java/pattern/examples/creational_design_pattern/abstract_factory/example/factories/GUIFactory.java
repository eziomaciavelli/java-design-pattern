package pattern.examples.creational_design_pattern.abstract_factory.example.factories;

import pattern.examples.creational_design_pattern.abstract_factory.example.buttons.Button;
import pattern.examples.creational_design_pattern.abstract_factory.example.checkboxes.CheckBox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
