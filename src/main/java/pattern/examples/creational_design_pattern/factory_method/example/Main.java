package pattern.examples.creational_design_pattern.factory_method.example;

import pattern.examples.creational_design_pattern.factory_method.example.factory.Dialog;
import pattern.examples.creational_design_pattern.factory_method.example.factory.HtmlDialog;
import pattern.examples.creational_design_pattern.factory_method.example.factory.WindowsDialog;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
