import java.math.BigInteger;
public class Problem25_1000DigitFibonacci
{
    public static void main(String[] args)
    {
        long begin = System.currentTimeMillis();
        
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(2);
        BigInteger c = BigInteger.valueOf(0);
        String s = "1";
        for(int i = 0; i < 999; i++)
            s = s + "0";
        BigInteger MAX = new BigInteger(s);
        
        int i = 3;
        for (i = 3; b.compareTo(MAX) < 0; i++)
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println("i: " + i);
 
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}