import java.util.Random;

public class D20 {
    private Random random;

    public D20() {
        random = new Random();
    }

    public int roll() {
        return random.nextInt(20) + 1;
    }
}
