package pattern.structural_design_pattern.bridge.example;

import pattern.structural_design_pattern.bridge.example.devices.Device;
import pattern.structural_design_pattern.bridge.example.devices.Radio;
import pattern.structural_design_pattern.bridge.example.devices.Tv;
import pattern.structural_design_pattern.bridge.example.remotes.AdvancedRemote;
import pattern.structural_design_pattern.bridge.example.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
