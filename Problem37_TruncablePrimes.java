public class Problem37_TruncablePrimes {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        PrimeSieve p = new PrimeSieve(1000000);
        boolean[] isPrime = p.getPrimes();
        int i = 11;
        while (count < 11) {
            if (isPrime[i]) {
                int rTrunk = i / 10, lTrunk = reverse(i) / 10;
                while (isPrime[rTrunk] && isPrime[lTrunk] && rTrunk > 9 && lTrunk > 9) {
                    rTrunk /= 10;
                    lTrunk /= 10;
                }
                if (isPrime[rTrunk] && isPrime[lTrunk]) {
                    System.out.println(i);
                    count++;
                    sum += i;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
    private static int reverse(int n) {
        String num = Integer.toString(n);
        String r = "";
        for (int i = 0; i < num.length(); i++) {
            r = r + num.substring(num.length()-i-1,num.length()-i);
        }
        return Integer.parseInt(r);
    }
}