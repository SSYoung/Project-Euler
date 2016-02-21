public class Problem36_DoubleBasePalindromes {
    private static final int MAX = 1000000;
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < MAX; i++) {
            if (isPalindrome(i + "") && isPalindrome(binary(i)))
                sum += i;
        }
        System.out.println(sum);
    }
    public static boolean isPalindrome(String num) {
        boolean isP = true;
        for (int i = 0; i < num.length()/2; i++) {
            if (num.charAt(i) != num.charAt(num.length()-i-1))
                isP = false;
        }
        return isP;
    }
    public static String binary(int e) {
        if (e == 0)
            return "0";
        String bin = "";
        int n = e;
        int max = (int)Math.ceil(Math.log(n)/Math.log(2));
        for (int i = max; i >= 0; i--) {
            if ((int)Math.pow(2,i) <= n) {
                n -= (int)Math.pow(2,i);
                bin = bin + "1";
            }
            else {
                bin = bin + "0";
            }
        }
        while (bin.charAt(0) == '0') {
            bin = bin.substring(1);
        }
        return bin;
    }

}