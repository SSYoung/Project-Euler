public class Problem40_ChampernowneC {
    /*
    An irrational decimal fraction is created by concatenating the positive intergers
    0.12345678910111213141516....
    The 12th digit of the fractional part is 1
    if d_n represents the nth digit of the fractiona part, find the value of the following expression
        d_1 * d_10 * d_100 * d_1000 * d_10000 * d_100000 * d_1000000
    
    FORMULA For By Hand Approach:
        d_n = (n - previous_produced_digits)/digit_len + num_prev_terms
            Then take the first digit of what's left
        d_1 = 1
    The one digit numbers produce 9 digits
        d_10 = 1
    The two digit numbers produce 180 digits
        d_100 = (100 - 9)/2 + 9 = 9 1/2 = 1
    The Three digit numbers produce 2700 digits
        d_1000 = (1000-189)/3 + 99 = 369 1/3 = 3
    The Four digit numbers produce 36000 digits
        d_10000 = (10000 - 2889)/4 + 999 = 2776 3/4 = 7
    The five digit numbers produce 450000 digits
        d_100000 = (100000 - 38889)/5 + 9999 = 22221 1/5 = 2 
    The six digit numbers produce 5400000 digits
        d_1000000 = 
    */
    // BRUTE FORCE with StringBuilder to minimize runtime
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder("");
        int count = 1;
        while (build.length() < 1000001) {
            build.append(count);
            count++;
        }
        int o = 1;
        int ten = 1;
        int h = Integer.parseInt(build.substring(99,100));
        int t = Integer.parseInt(build.substring(999,1000));
        int tt = Integer.parseInt(build.substring(9999,10000));
        int ht = Integer.parseInt(build.substring(99999,100000));
        int m = Integer.parseInt(build.substring(999999,1000000));
        System.out.println(o*ten*h*t*tt*ht*m);
    }
}