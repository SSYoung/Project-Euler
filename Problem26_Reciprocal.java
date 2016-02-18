import java.util.Arrays;

public class Problem26_Reciprocal {
    public static void main(String[] args) {
        int longestRepeat = 0, bestD = 0;
        PrimeSieve p = new PrimeSieve(1000);
        for (int d = 7; d < 1000; d++) {
            if(!p.array[d])
                continue;
            int[] remainders = new int[d];
            int val = 1, pos = 0;
            
            while (remainders[val] == 0 && val != 0) {
                remainders[val] = pos;
                val *= 10;
                val %= d;
                pos++;               
            }
            if (pos - remainders[val] > longestRepeat) {
                longestRepeat = pos - remainders[val];
                bestD = d;                
            }            
        }
        System.out.println(bestD);
    }
}

