public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // simple increment
                return digits; // done
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // 100...0
        return result;
    }
}
