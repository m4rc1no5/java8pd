package Chapter10ConcurrentProgramming.example01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Printer implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
    private String msg;

    public Printer(String msg) {
        this.msg = msg;
    }

    public void run() {
        for (int i = 1; i < 1000; i++) {
            logger.info("{}: {}", msg, i);
        }
    }
}
