/**
*  https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
* 1281. Subtract the Product and Sum of Digits of an Integer
**/
class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, mul = 1;
        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            mul *= digit;
            n = n/10;
        }
        return mul - sum;
    }
};