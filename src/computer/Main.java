package computer;

public class Main {
    public static void main(String[] args) {
        Computer [] computers = new Computer[5];
        computers [0] = new Computer(0);
        computers [1] = new Computer(1);
        computers [2] = new Computer(2);
        computers [3] = new Computer(3);
        computers [4] = new Computer(4);
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers [i]);
        }
    }
}
