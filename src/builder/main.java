package builder;

import builder.ComputerFactory;

public class main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBlueprint());

        factory.make();

        Computer computer = factory.getComputer();

        System.out.println(computer.toString());
    }
}
