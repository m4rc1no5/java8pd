package Chapter10ConcurrentProgramming.example02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Callable<Integer>> tasks = new ArrayList<>();
        tasks.add(() -> (new RandomInteger(12)).getNumber());
        tasks.add(() -> (new RandomInteger(2)).getNumber());
        tasks.add(() -> (new RandomInteger(65)).getNumber());
        tasks.add(() -> (new RandomInteger(34)).getNumber());
        tasks.add(() -> (new RandomInteger(68)).getNumber());
        tasks.add(() -> (new RandomInteger(11)).getNumber());
        tasks.add(() -> (new RandomInteger(11)).getNumber());

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Integer>> results = executorService.invokeAll(tasks);

        for (Future<Integer> result : results) {
            logger.info("Found in {} time!", result.get());
        }
    }
}
