package Model.computer;

public class PC extends Computer{

    private boolean powerSupply;

    public PC(String name, String type, int hdd, int ram, boolean powerSupply) {
        super(name, type, hdd, ram);
        this.powerSupply = powerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupply == true) {
            super.switchOn();
        } else {
            System.out.println("Plug in the power supply");
        }
    }

    public void setPowerSupply(boolean newPowerSupply) {
        powerSupply = newPowerSupply;
    }
}
