package Chapter10ConcurrentProgramming;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Example01 {
    public static void main(String[] args) {
        Runnable powitania = new Printer("Witaj");
        Runnable pozegnania = new Printer("Żegnaj");

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(powitania);
        executor.execute(pozegnania);
    }
}
