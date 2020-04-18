/**
 * https://leetcode-cn.com/problems/transpose-matrix/
 * 867. 转置矩阵
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] res = new int[c][r];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}