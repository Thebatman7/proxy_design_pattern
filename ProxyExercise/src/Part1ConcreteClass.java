import java.util.concurrent.ThreadLocalRandom;

public class Part1ConcreteClass implements Part1Interface {

    @Override
    public int getRandomNum() {
        //This ThreadLocalRandom.current() is just to get a random number
        return ThreadLocalRandom.current().nextInt();
    }

    @Override
    public int getRandomEvenNum() {
        int randomNum = ThreadLocalRandom.current().nextInt();
        if ((randomNum % 2) == 0) {
            return randomNum;
        }
        else {
            return randomNum + 1;
        }
    }

    @Override
    public int getRandomOddNum() {
        int randomNum = ThreadLocalRandom.current().nextInt();
        if ((randomNum % 2) != 0) {
            return randomNum;
        }
        else {
            return randomNum + 1;
        }
    }
}
