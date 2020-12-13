package Model.computer;

import Model.computer.Laptop;
import Model.computer.PC;

public class MainApp5 {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 40);

        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2 ", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop2 = new Laptop("XGames", "HP Games", 500, 256, 40);
        Computer macbook = new Laptop("MB Pro", "PRO", 500, 256, 100);

        //    Computer computer = new Computer("test", "HP", 123, 123);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop2, macbook};
        for (Computer computer : computers
        ) {
            computer.switchOff();
        }

        //odniesienie do metody, ktorej nie ma w klasie - matka
     /*   ((PC)officeComputer2).showComputerName();

        //zglosnienie laptopa i PC
        System.out.println(officeComputer1.volumeUp());
        System.out.println(gamingLaptop.volumeUp());

        System.out.println(officeComputer1.volumeDown());
        System.out.println(officeComputer2.volumeDown());
        System.out.println(gamingLaptop2.volumeDown())*/
        ;

        System.out.println("Gaming laptop up: ");
        System.out.println(gamingLaptop.volumeUp(0));
        System.out.println(gamingLaptop.volumeUp(99));
        System.out.println(gamingLaptop.volumeUp(100));

        System.out.println("Gaming laptop down: ");
        System.out.println(gamingLaptop.volumeDown(0));
        System.out.println(gamingLaptop.volumeDown(1));
        System.out.println(gamingLaptop.volumeDown(100));

        System.out.println("Office computer1 up: ");
        System.out.println(officeComputer1.volumeUp(0));
        System.out.println(officeComputer1.volumeUp(99));

        System.out.println("Office computer1 down: ");
        System.out.println(officeComputer1.volumeDown(0));
        System.out.println(officeComputer1.volumeDown(1));
        System.out.println(officeComputer1.volumeDown(100));

        //System.out.println(officeComputer1.volumeDown(50));


        /* Laptop gamingLaptop
        gamingLaptop.setBatteyLevel(0);
        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());*/
        //officeComputer
/*        officeComputer.showComputerName();
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        // plug in the power supply
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());*/
    }
}

