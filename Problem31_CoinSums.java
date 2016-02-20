public class Problem31_CoinSums {
    public static int[] coins = {200, 100, 50, 20 , 10, 5, 2, 1};
    public static void main(String[] args) {
        int target = 200;
///Brute Force
/*        int times = 0;
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
        System.out.println(times);*/

///Dynamic Programming 
/*        int[] coinSizes = {1,2,5,10,20,50,100,200};
        int[] ways = new int[target + 1];
        ways[0] = 1;
        for (int i = 0; i < coinSizes.Length; i++) {
            for (int j = coinSizes[i]; j <= target; j++) {
                ways[j] += ways[j - coinSizes[i]];
            }
        }

        int sum = 0;
        for(int i = 0; i < ways.length; i++) {
            sum += ways[i];
        }
        System.out.println(sum);*/

///Recursive
        System.out.println(findSum(200,0));
    }
    public static int findSum(int money, int coin) {
        int sum = 0;
        if(coin == (coins.length - 1))
            return 1;
        for(int i = coin; i < coins.length; i++) {
            if(money - coins[i] == 0)
                sum += 1;
            if(money - coins[i] > 0)
                sum += findSum(money-coins[i], i);
        }
        return sum;
    }
}