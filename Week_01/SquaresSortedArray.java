class Solution {
    public int[] sortedSquares(int[] A) {
        // 思路一：若是负数，取绝对值，按照插入排序方式往后插入
        // 原地结果 空间复杂度O(1)  时间复杂度O(n^2)
        int first = A[0];
        while(first < 0) {
            int absFirst = Math.abs(first);
            int j = 1;
            for(j = 1; j < A.length && A[j] < absFirst; j++) {
                A[j-1] = A[j];
            }
            A[j-1] = absFirst;
            first = A[0];
        }
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        return A;
    }
}