class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] r = new int[n - 2][n - 2];
        for (int i = 0; i <n - 2; i++)
            for (int j = 0; j < n - 2; j++)
                r[i][j] = getMax(grid, i, j);
        return r;
    }

    private int getMax(int[][] grid, int row, int col) {
        int max = grid[row][col];
        for (int i = row; i < row + 3; i++)
            for (int j = col; j < col + 3; j++)
                max = Math.max(grid[i][j], max);
        return max;
    }
}
