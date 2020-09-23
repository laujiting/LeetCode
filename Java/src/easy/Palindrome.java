package easy;

public class Palindrome {
    public static boolean isPalindrome(int x, boolean isPrint) {
        /**
         * 方法一  翻转一半数字
         * 考虑输入的数字不可能溢出，因此翻转后的数字不可能溢出
         * 考虑特殊情况：负数、末尾为0的数值肯定不是回文数
         * 翻转一半时，如果是奇数，那么剩下的x小于res时停止
         * 如果是偶数，是回文数时两者相等则即刻跳出循环，不是则还会计算一轮
         * 只有x == res时才会是回文数
         */
        /**
         * 时间复杂的O(log10(x))，也就是O(n)
         * 空间复杂度O(1)，只需要常数个变量
         */
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int res = 0;
        if (isPrint) {
            System.out.println("x:" + x + ", res:" + res);
        }
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
            if (isPrint) {
                System.out.println("x:" + x + ", res:" + res);
            }
        }
        //前者为偶数情况，后者为奇数情况
        return x == res || x == res/10;
    }

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(isPalindrome(123321, flag));
        System.out.println(isPalindrome(12321, flag));
        System.out.println(isPalindrome(123221, flag));
        System.out.println(isPalindrome(0, flag));
        System.out.println(isPalindrome(-123321, flag));
    }
}
