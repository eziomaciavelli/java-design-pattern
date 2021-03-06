package pattern.creational_design_pattern.abstract_factory.example;

import pattern.creational_design_pattern.abstract_factory.example.app.Application;
import pattern.creational_design_pattern.abstract_factory.example.factories.GUIFactory;
import pattern.creational_design_pattern.abstract_factory.example.factories.MacOSFactory;
import pattern.creational_design_pattern.abstract_factory.example.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Main {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name".toLowerCase());
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
