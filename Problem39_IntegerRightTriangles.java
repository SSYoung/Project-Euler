public class Problem39_IntegerRightTriangles {
    public static void main(String[] args) {
/*        a^2 + b^2 = c^2 
        a + b + c = p
        a^2 + b^2 = (p-a-b)^2
        a^2 + b^2 = p^2
        a^2 + b^2 = p^2 - pa - pb - ap + a^2 + ab - bp + ab + b^2
        0 = p^2 - 2pa - 2pb + 2ab  
        2pb - 2ab = p^2 - 2pa
        b = (p^2 - 2pa)/(2p - 2a)

        Pythagorean Triplets
            Every odd number is the a side of a Pythagorean triplet
            The side b is(a^2 - 1)/2
            The side c is b + 1
*/
        int bestP = 0, numberOfSolutions = 0;
        for (int p = 2; p <= 1000; p++) {
            int count = 0;
            for (int a = 1; a <= (p/2); a++) {
                int b = p*(p - 2*a) / (2*(p - a));
                if ( (a*a + b*b) == (p-a-b)*(p-a-b)) {
                    count++;
                }
            }
            System.out.println(count);
            if(count > numberOfSolutions) {
                numberOfSolutions = count;
                bestP = p;
            }

        }
        System.out.println(bestP);
    }
}