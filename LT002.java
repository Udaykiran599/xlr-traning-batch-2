public class LT002 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // Check for overflow
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }

    public static void main(String[] args) {
        LT002 solution = new LT002();
        System.out.println(solution.reverse(123)); 
        System.out.println(solution.reverse(-123)); 
        System.out.println(solution.reverse(120)); 
        System.out.println(solution.reverse(0)); 
    }
}
