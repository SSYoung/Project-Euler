public class Problem31_CoinSums {
//    private static final int oneP = 1, twoP = 2, fiveP = 5, tenP = 10; twentyP = 20, fiftyP = 50, onePound = 100, twoPound = 200;
    public static void main(String[] args) {
        int target = 200;
        int times = 0;
        for(int a = target; a >= 0; a-= 200) {
            for(int b = a; b >= 0; b -= 100) {
                for(int c = b; c >= 0; c -= 50) {
                    for(int d = c; d >= 0; c -= 20) {
                        for(int e = d; e >= 0; e -= 10) {
                            for(int f = e; f >= 0; f -= 5) {
                                for(int g = f; g >= 0; g -= 2) {
                                    times++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}