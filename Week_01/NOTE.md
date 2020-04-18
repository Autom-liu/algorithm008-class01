# 学习笔记

## 1281 整数的各位积和之差

取整数的各位数字的计算方法：

取余，除10退位

```java
while (n > 0) {
  int digit = n % 10;
  n = n/10;
}
```

## 867 转置矩阵

基本原理：若B是A的转置矩阵，则有B[j][i] = A[i][j]

二维数据的行列计算公式

```java
int r = A.length; // 行
int c = A[0].length // 列
```

## 977 有序数组的平方

思路一： 若是负数，取绝对值，按插入有序数组的方式插入
原地结果  空间复杂度O(1)  时间复杂度O(n^2)

将数组首元素往后插入到有序数组内：

```java
int j = 1;
int ele = A[0];
for(j = 1; j < A.length && A[j] < ele; j ++) {
  A[j-1] = A[j];
}
A[j-1] = ele;
```

将数组末元素往前插入到有序数组内：

```java
int j = A.length - 1;
int ele = A[j];
for(j = j - 1; j >= 0 && A[j] > ele; j--) {
  A[j+1] = A[j];
}
A[j+1] = ele;
```
