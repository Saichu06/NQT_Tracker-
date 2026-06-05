import java.util.*;

class rowAndMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0;
        int count = 0;

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < n; i++) {
            if (mat[0][i] == 1) {
                count++;
            }
        }

        for (int i = 1; i < m; i++) {
            int currMax = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    currMax++;
                }
            }
            if (currMax > count) {
                count = currMax;
                row = i;
            }
        }

        return new int[] { row, count };
    }
}