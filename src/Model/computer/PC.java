package Model.computer;

public class PC extends Computer {

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

    @Override
    public void switchOff() {
        System.out.println("Wylaczam PC " + name);
        state = false;
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeUp(int volumeLevel) {
        volumeLevel +=1;
        if( volumeLevel >=100) {
            return 100;
        } else {
            return volumeLevel;
        }
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeLevel) {
        volumeLevel -=2;
        if (volumeLevel <=0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }
}
