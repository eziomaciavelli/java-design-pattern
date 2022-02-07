package pattern.creational_design_pattern.factory_method.example.factory;

import pattern.creational_design_pattern.factory_method.example.buttons.Button;
import pattern.creational_design_pattern.factory_method.example.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}