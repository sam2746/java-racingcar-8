public final class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveIf(int random) {
        if (random >= 4) position++;
    }

    public String name() { return name; }
    public int position() { return position; }
    public String progress() { return "-".repeat(position); }
}
