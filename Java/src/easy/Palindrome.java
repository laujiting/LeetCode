package easy;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        /**
         * 方法一  翻转一半数字
         * 考虑输入的数字不可能溢出，因此翻转后的数字不可能溢出
         * 考虑特殊情况：负数、末尾为0的数值肯定不是回文数
         */
        /**
         * 时间复杂的O(log10(x))，也就是O(n)
         * 空间复杂度O(1)，只需要常数个变量
         */
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        //前者为偶数情况，后者为奇数情况
        return x == res || x == res/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-123321));
    }
}
