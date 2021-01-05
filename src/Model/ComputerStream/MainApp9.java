package Model.ComputerStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainApp9 {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();

        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 1", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));

        System.out.println("1. count the computer with more than 128 ram");
        long sizeRam = computers.stream()
                .filter(in -> in.getRam().getSize() > 128)
                .count();

        System.out.println("size ram more than 128: " + sizeRam);

        System.out.println("2. display the name of computer's type: ");
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        System.out.println("3. display the name of computer with the highest RAM memory: ");
        // 3.1 used isPresent and get:
        Optional<Computer> maxRamComparator = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()));
        if (maxRamComparator.isPresent()) {
            System.out.println(maxRamComparator.get());
        } else {
            System.out.println("There is no result to display");
        }

        // 3.2 used orElseThrow
        Computer ramMaxOrElseThrow = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("There is no computer to display "));
        System.out.println(ramMaxOrElseThrow.getName());

        // 3.3 used orElse
        Integer ramMaxOrElse = computers.stream()
                .map(comp -> comp.getRam().getSize())
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(ramMaxOrElse);

        // 3.4 orElseGet
        Computer ramMaxOrElseGet = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseGet(() -> new PC("Test", "Test1", new Hdd("Dell", 500), new Ram("Dell", 128)));

        System.out.println(ramMaxOrElseGet.getName());

        System.out.println("4. Create a new list with computers, which have a hdd less than 500");

        List<Computer> hddLessThan500 = computers.stream()
                .filter(str -> str.getHdd().getSize() < 500)
                .collect(Collectors.toList());
        for (Computer computer : hddLessThan500) {
            System.out.println(computer.getName() + " " + computer.getHdd().getSize());
        }

        System.out.println("5. sorted the computers by name and type");
        List<Computer> sortedListComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer computer : sortedListComputers) {
            System.out.println(computer.getName() + " " + computer.getType());
        }

        System.out.println("6. Find the one computer with hdd less than or equal to 500  used ifPresent");
        computers.stream()
                .filter(computer -> computer.getHdd().getSize() >= 500)
                .findFirst()
                .ifPresent(computer -> System.out.println(computer.getName()));


        System.out.println("6. Find the one computer with hdd less than or equal to 500 - used ifPresentOrElse");
        computers.stream()
                .filter(computer -> computer.getHdd().getSize() >= 500)
                .findFirst()
                .ifPresentOrElse(computer -> System.out.println(computer.getName()), () -> System.out.println("no computer"));
    }
}
