package patterns.behavioural.command_design;

public class Driver {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Red red = new Red(new Light());
        Yellow yellow = new Yellow(new Light());
        Green green = new Green(new Light());

        invoker.submit(red);
        invoker.submit(yellow);
        invoker.submit(green);
    }
}
