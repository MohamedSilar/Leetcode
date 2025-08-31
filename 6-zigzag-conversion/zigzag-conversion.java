class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        char[][] matrix = new char[numRows][s.length()];
        int row = 0, col = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {
            matrix[row][col] = s.charAt(i);

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        // Manually build result without using StringBuilder
        char[] result = new char[s.length()];
        int index = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (matrix[i][j] != 0) {
                    result[index++] = matrix[i][j];
                }
            }
        }

        return new String(result);
    }
}
