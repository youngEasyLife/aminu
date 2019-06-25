package com.young.aminu.common;

import java.util.Arrays;

/**
 * created with IntelliJ IDEA.
 * @author : yang
 * @date : 2019/6/23
 * time: 21:20
 * desc:
 */
public class EasySoft {
    public static void main(String[] args) {
        int[] a = new int[]{11, 3, 123, 21321, 12, 1, 2, 434, 21, 3};
        easySort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        easySortQuick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    /**
     * desc: 冒泡排序
     * 从一个开始和后面的值比，大就换位置
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


    /**
     * 快速排序法（二分法快速排序）
     * @param sort ：数组
     * @param start ：起始值
     * @param end ：结束值
     */
    private static void easySortQuick(int[] sort, int start, int end) {
        if(start < end){
            int theNum = sort[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && theNum <= sort[high]) {
                    high --;
                }
                sort[high] = sort[low];
                while (low < high && sort[low] <= theNum) {
                    low ++;
                }
                sort[low] = sort[high];
            }
            sort[low] = theNum;
            easySortQuick(sort,start,low);
            easySortQuick(sort,low+1,end);
        }
    }

}
