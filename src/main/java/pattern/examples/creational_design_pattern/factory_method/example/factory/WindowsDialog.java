package pattern.examples.creational_design_pattern.factory_method.example.factory;

import pattern.examples.creational_design_pattern.factory_method.example.buttons.WindowsButton;
import pattern.examples.creational_design_pattern.factory_method.example.buttons.Button;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}