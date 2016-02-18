public class Problem28_NumberSpiralDiagonals {
    public static void main(String[] args) {
        long tr = 9 + diagonal(5,9,0);
        long tl = 7 + diagonal(5,7,2);
        long bl = 5 + diagonal(5,5,4);
        long br = 3 + diagonal(5,3,6);
        System.out.println(1L + tr + tl + bl + br);
    }
    public static long diagonal(int current, long val, int shift) {
        val = (val + 8 - shift + 8 * ((current-2)/2));
        if(current == 1001) {
            return val;
        } else {
            return (val + diagonal(current+2,val,shift));
        }
    }
}