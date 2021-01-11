package builder2;

public class main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .build();

        System.out.println(computer.toString());
    }
}
