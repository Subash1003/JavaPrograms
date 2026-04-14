
public class armstrong {

    public static boolean am(int num) {
        int sum = 0, og = num;
        String s = Integer.toString(num);
        int len = s.length();
        while (og > 0) {
            int digit = og % 10;
            sum += Math.pow(digit, len);
            og = og / 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 500; i++) {
            if (am(i)) {
                System.out.println(i + " " + am(i));
            }
        }
    }
}
