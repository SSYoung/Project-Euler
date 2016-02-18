public class PrimeSieve 
{
    boolean[] array;
    public PrimeSieve()
    {
        array = createPrimeArray(10);   
    }
    public PrimeSieve(int n)
    {
        array = createPrimeArray(n);
    }
    public boolean[] createPrimeArray(int N) 
    { 
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) 
        {
            isPrime[i] = true;
        }
        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= N; i++) 
        {
            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) 
            {
                for (int j = i; i*j <= N; j++) 
                {
                    isPrime[i*j] = false;
                }
            }
        }
        return isPrime;
//         // count primes
//         int primes = 0;
//         for (int i = 2; i <= N; i++) 
//         {
//             if (isPrime[i]) primes++;
//         }
//         System.out.println("The number of primes <= " + N + " is " + primes);
    }
}