public class Problem33_DigitCancellingFraction {
    public static void main(String[] args) {
        int denominator = 1;
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                if( (i == j) || !hasFactor(a,b))
                    continue;
                String num = i + "";
                String den = j + "";
                String num1 = num.substring(1);
                String den1 = num.substring(1);
                int n = String.valueOf(num1);
                int d = String.valueOf(den1);
            } 
        }
    }
    public static boolean hasFactor(int a, int b) {
        int min = Math.min(a,b);
        for(int i = 2; i < min; i++) {
            if ( ( (a/i)*i == a*i) && ( (b/i)*i == b*i))
                return true;
        }
        return false; 
    }
}