public class Problem27_QuadraticPrimes {
    public static void main(String[] args) {
        int bestN = 0;
        int bestA = 0, bestB = 0;
        PrimeSieve p = new PrimeSieve(1000000);
        boolean[] primes = p.array;
        for(int a = -999; a < 999; a++) {
            for (int b = -999; b < 999; b++) {
                if(!primes[Math.abs(b)])
                    continue;
                int n = 0;
                while(primes[quadPrime(a,b,n)]) {
                    n++;
                }
                if(n > bestN) {
                    bestN = n;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        System.out.println(bestA*bestB);
    }
    public static int quadPrime(int a, int b, int n) {
        return Math.abs(n*n + a*n + b); 
    }
}