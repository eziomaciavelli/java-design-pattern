package pattern.creational_design_pattern.factory_method.example.factory;


import pattern.creational_design_pattern.factory_method.example.buttons.Button;
import pattern.creational_design_pattern.factory_method.example.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}