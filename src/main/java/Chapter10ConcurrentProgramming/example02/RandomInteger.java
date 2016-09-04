package Chapter10ConcurrentProgramming.example02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

class RandomInteger {
    private static final Logger logger = LoggerFactory.getLogger(RandomInteger.class);
    private final static int MAX_NUMBER = 100;
    private int number;

    RandomInteger(int number) {
        this.number = number;
    }

    int getNumber() {
        boolean found = false;
        Random random = new Random();

        int i = 0;
        while (!found) {
            i++;
            int randomNumber = random.nextInt(MAX_NUMBER);
            logger.info("Random number: {}", randomNumber);

            if (randomNumber == number){
                found = true;
            }
        }

        return i;
    }
}
