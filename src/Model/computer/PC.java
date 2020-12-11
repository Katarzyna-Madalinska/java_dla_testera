package Model.computer;

public class PC extends Computer{

    private boolean powerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        powerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void setPowerSupply(boolean newPowerSupply) {
        powerSupply = newPowerSupply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupply) {
            super.switchOn();
        } else {
            System.out.println("Plug in the power supply");
        }
    }


}
