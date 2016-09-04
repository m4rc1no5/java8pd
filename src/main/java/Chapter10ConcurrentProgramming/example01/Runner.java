package Chapter10ConcurrentProgramming.example01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        Runnable powitania = new Printer("Witaj");
        Runnable pozegnania = new Printer("Żegnaj");

        int processors = Runtime.getRuntime().availableProcessors();

        logger.info("Processors: {}", processors);

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(powitania);
        executor.execute(pozegnania);
    }
}
