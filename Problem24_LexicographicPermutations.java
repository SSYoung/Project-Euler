public class Problem24_LexicographicPermutations {
    public static void swap (char[] arr, int l, int k) {
        char temp = arr[l];
        arr[l] = arr[k];
        arr[k] = temp;
    }

    public static void permutate(char[] arr) {
        int k = -1;
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1] && (k == -1 || k < i))
                k = i;
        }
        if( k == -1) 
            return;
        int l = k + 1;
        for(int i = k; i < arr.length; i++) {
            if (arr[k] < arr[i]) {
                if (arr[l] > arr[i])
                    l = i;
            }
        }
        swap(arr,l,k);
        int diff = arr.length - (k+1);
        for(int i = 0; i < diff/2; i++) {
            swap(arr,i+(k+1),arr.length-i-1);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        long time = System.currentTimeMillis();
        char[] input = {'0','1','2','3','4','5','6','7','8','9'};

        for(int i = 1; i < 1000000; i++) {
            permutate(input);
        }

        for (char i : input) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("time: " + (System.currentTimeMillis() - time));
    }
}