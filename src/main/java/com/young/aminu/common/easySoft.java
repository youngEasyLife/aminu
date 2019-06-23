package com.young.aminu.common;

/**
 * created with IntelliJ IDEA.
 * author: yang
 * date: 2019/6/23
 * time: 21:20
 * desc:
 */
public class easySoft {
    public static void main(String[] args) {
        int[] a = new int[]{11, 3, 123, 21321, 12, 1, 2, 434, 21, 3};
        easySort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * desc: 冒泡排序
     *
     *
     * @param sort :
     */
    private static void easySort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            for (int j = sort.length - 1; j > i; j--) {
                int temp = sort[i];
                if (temp > sort[j]) {
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
    }
}
