package Model.computer;

import Model.computer.Laptop;
import Model.computer.PC;

public class MainApp5 {
    public static void main(String[] args) {
        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 40);


       /* Laptop gamingLaptop
        gamingLaptop.setBatteyLevel(0);
        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());*/
       //officeComputer
        officeComputer.showComputerName();
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        // plug in the power supply
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
    }
}
