public class PrimeSieve {
    boolean[] isPrime;
    public PrimeSieve(int n) {
        isPrime = fillSieve(n);
    }
    public boolean[] getPrimes() {
        return isPrime;
    }
    private boolean[] fillSieve(int n) {
        boolean[] p = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            p[i] = true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (p[i]) {
                for (int j = i; i*j <= n; j++) {
                    p[i*j] = false;
                }
            }
        }
        return p;
    }
}