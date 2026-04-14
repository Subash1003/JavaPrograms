import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Newprogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        // Take array input
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // LinkedHashSet removes duplicates while maintaining insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Convert to ArrayList for index-based reverse traversal
        ArrayList<Integer> list = new ArrayList<>(set);

        // Print in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}