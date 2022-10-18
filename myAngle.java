import java.util.concurrent.ThreadLocalRandom;

public class myAngle {

    public double angle()
    {
        double double_rand = ThreadLocalRandom.current().nextDouble(); 
        return double_rand;
    }
}