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

    @Override
    public void switchOff() {
        System.out.println("Wylaczam laptop " + name);
        state = false;
    }

    public void setBatteyLevel(int newBatteryLevel) {
        baterryLevel = newBatteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
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
        volumeLevel -= 2;
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

