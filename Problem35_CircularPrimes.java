public class Problem35_CircularPrimes {
    private static final int MAX = 1000000;
    public static void main(String[] args) {
        PrimeSieve p = new PrimeSieve(MAX);
        boolean[] isPrime = p.getPrimes();
        int cirCount = 0;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                boolean cir = true;
                String org = i + "";
                for (int c = 0; c < org.length(); c++) {
                    int num = Integer.parseInt(org.substring(c) + org.substring(0,c));
                    if (!isPrime[num])
                        cir = false;
                }
                if (cir)
                    cirCount++;
            }
        }
        System.out.println("The number of circular primes is: " + cirCount);
    }
}