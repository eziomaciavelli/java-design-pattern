package pattern.creational_design_pattern.abstract_factory.example.checkboxes;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox.");
    }
}
