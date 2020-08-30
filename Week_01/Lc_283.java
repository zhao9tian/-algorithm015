package lc;

public class Lc_283 {

    public static void main(String[] args) {
        Lc_283 lc_283 = new Lc_283();
        lc_283.moveZeroes(new int[]{1,1,0,3,12});
    }

    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                // 如果数组前面没有0的元素，i=j，若i>j，说明已经有0在了。
                if (i > j) {
                    // 因为j一旦比y小，说明j当时的位置就是0；否则j就++，和i一样大了。
                    // 把非0 和0的位置进行交换
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }

        }
    }
}
