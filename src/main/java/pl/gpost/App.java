package pl.gpost;

/**
 * Hello world!
 */
public class App {

    private final int a;
    private final int b;

    public App(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateSum() {
        return a + b;
    }

    public int calculateDiff() {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
