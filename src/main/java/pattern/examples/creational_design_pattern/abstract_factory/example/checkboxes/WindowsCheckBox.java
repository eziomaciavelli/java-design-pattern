package pattern.examples.creational_design_pattern.abstract_factory.example.checkboxes;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox.");
    }
}
