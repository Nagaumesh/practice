import java.util.*;

public class rough2 {
    public static void main(String[] args) {
        int nums[] = { 5, 3, 2, 4, 1 };
        int target = 5;
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        util(nums, target, 0, 0, s);

    }

    public static void util(int nums[], int target, int sum, int i, Stack<Integer> s) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            System.out.println(s);
            return;
        }
        if (i < nums.length) {
            // not selected
            util(nums, target, sum, i + 1, s);
            // selected
            s.push(i);
            util(nums, target, sum + nums[i], i + 1, s);
            s.pop();
        }

    }
}