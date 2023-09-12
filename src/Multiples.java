public class Multiples {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 1000; i++){
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                s ++;
            }
        }
        System.out.println(s);
    }
}
