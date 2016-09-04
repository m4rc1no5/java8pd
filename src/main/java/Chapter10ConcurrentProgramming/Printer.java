package Chapter10ConcurrentProgramming;

public class Printer implements Runnable {
    private String msg;

    public Printer(String msg) {
        this.msg = msg;
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(String.format("%s: %s", msg, i));
        }
    }
}
