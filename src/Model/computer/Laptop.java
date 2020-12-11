package Model.computer;

public class Laptop extends Computer {
    private int baterryLevel;

    public Laptop(String name, String type, int hdd, int ram, int baterryLevel) {
        super(name, type, hdd, ram);
        this.baterryLevel = baterryLevel;

    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (baterryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is to low!");
        }

    }

    public void setBatteyLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }
}
