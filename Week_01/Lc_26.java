package lc;

import java.io.IOException;

/**
 * Created by tianmingzhao on 2020/5/9.
 * 2020/5/9.
 */
public class Lc_26 {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1,1,1,2};

        int count = new Lc_26().removeDuplicate1(arr);
//        System.out.println(count);
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }

    // 双指针法 - 网上参考的思路，看了下动画
    private int removeDuplicate1(int[] arr) {

        int countIndex = 0;
        int i = 0;
        for (int j = i + 1;j<arr.length ;i++,j++) {
            if (arr[i] != arr[j] ) {
                arr[++countIndex] = arr[j];
            }
        }
        // 返回长度的话，就是下标 + 1
        return countIndex + 1;
    }



    // 简单粗暴的双循环办法，缺点是，要不断地挪动后面的数组
    private int removeDuplicate(int[] arr) {

        int maxIndex = arr.length-1;
        for (int i = 0;i < maxIndex; i++) {
            if (arr[i] == arr[i+1]) {
                this.removeEle(arr,i);
                i--;
                maxIndex--;
            }
        }
        return maxIndex + 1;
    }

    private  void removeEle(int[] arr, int index) {
        for (int i = index ; i < arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
