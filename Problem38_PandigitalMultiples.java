public class Problem38_PandigitalMultiples {
    public static void main(String[] args) {
        long max = 0;
        for (long i = 1; i < 10000; i++) {
            long pan = i, scalar = 2;
            while ((Long.toString(pan)).length() < 9) {
                pan = concat(pan,i*scalar);
                scalar++;
            }
            if (scalar > 2 && isPandigital(pan) && pan > max) {
                max = pan;
            }
        }
        System.out.println(max);
    }
    public static long concat(long a, long b) {
        return Long.parseLong(Long.toString(a) + Long.toString(b));
    }
    public static boolean isPandigital(long p) {
        String pan = Long.toString(p);
        boolean isPan = true;
        if (pan.length() > 9)
            return false;
        for (int i = 1; i < 10; i++) {
            if (pan.indexOf(Long.toString(i)) == -1)
                isPan = false;
        }
        return isPan;
    }
}