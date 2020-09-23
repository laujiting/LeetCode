package easy;

public class NumReverse {
    public static int NumReverse(int x) {
        /**
         * 考虑将末位弹出，将其作为res的首位
         * 后续弹出的依次加入res的末位
         * pop operation
         * int pop = x % 10;
         * int rest = x / 10;
         * push operation
         * int res = 0;
         * temp = res * 10 + pop;
         * res = temp;
         */
        /**
         * 溢出情况，可以考虑res与INT_MAX进行比较
         * 如果是32位，2^31-1=21 4748 3647 和 -21 4748 3648
         * 如溢出也就是temp >= res * 10 + pop
         * 此时等价于1) res ==INT_MAX/10 && pop>7
         *         2) res > INT_MAX/10
         */
        int res = 0;
        //需要考虑负数的情况，因此判断条件不是x>0
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE/10 ||
                    (res == Integer.MAX_VALUE/10 && pop >7)) {
                return 0;
            }
            else if (res < Integer.MIN_VALUE/10 ||
                    (res == Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }
            res = res * 10 +pop;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(NumReverse(Integer.MIN_VALUE-1));
        System.out.println(NumReverse(Integer.MIN_VALUE+1));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(NumReverse(Integer.MAX_VALUE-1));
        System.out.println(NumReverse(Integer.MAX_VALUE+1));
    }
}
