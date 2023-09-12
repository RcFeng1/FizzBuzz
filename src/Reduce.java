public class Reduce {
    public static void main(String[] args) {
        int s = 0;
        int n = 100;
        for (int i = n; i > 0;){
            // Find out which numbers odd
            boolean odd = i % 2 == 1;
            // Print our appropriate result.
            if (odd) {
                i --;
            }else{
                i = i / 2;
            }s ++;
        }
        System.out.println(s);
    }
}
