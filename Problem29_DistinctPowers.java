import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;
public class Problem29_DistinctPowers {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int max = 100;
        Set<Double> powers = new HashSet<Double>();
        for(int a = 2; a <= max; a++) {
            for(int b = 2; b <= max; b++) {
                powers.add(Math.pow(a,b));
            }
        }

        long stopTime = System.currentTimeMillis();
        System.out.printf("Elapsed Time: %s\n%d",stopTime - startTime, powers.size());
    }
}