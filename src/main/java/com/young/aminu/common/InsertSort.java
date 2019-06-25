package com.young.aminu.common;

import java.util.Arrays;

/**
 * @author young
 * ClassName InsertSort
 * Description 插入排序
 * Date 2019/6/25 8:37
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] num = new int[]{2234, 2342344, 34, 324, 234, 45, 23, 234, 4, 23424, 234, 23, 23423};
        insertSortNum(num);
        System.out.println(Arrays.toString(num));
    }


    /**
     * 自想插入排序
     *
     * @param num ：
     */
    private static void insertSortNum(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int y = i;
            int s = i - 1;
            while (s >= 0 && num[i] < num[s]) {
                int low = num[i];
                num[i] = num[s];
                num[s] = low;
//              替换后i和s的位置后移，故需要i--;
                s--;
                i--;
            }
            i = y;
        }
    }
}
