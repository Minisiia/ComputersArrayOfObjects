package computer;

public class Computer {
    private int index;

    public Computer(int index) {
        this.index = index;
    }

    @Override
    public String toString() {       //перевірка стану об'єкта
        return "Computer{" +
                "index=" + index +
                '}';
    }
}
