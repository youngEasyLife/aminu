package com.young.aminu.common;

import java.util.Scanner;

/**
 * @author young
 * ClassName Floyed
 * Description TODO
 * Date 2019/7/4 15:44
 */
public class Floyed {
    static int N;
    static int M;
    static int[][] arr;
    static final int init_value = 888888888;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[N+1][N+1];
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                if (i!=j){
                    arr[i][j] = init_value;
                }
            }
        }
        int a,b,c;
        for (int i = 0; i <M ; i++) {
            a =scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            arr[a][b] = c;
            arr[b][a] = c;
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                for (int k = 1; k <=N ; k++) {
                    if (j!=k){
                        if (arr[j][k]>arr[j][i]+arr[i][k]){
                            arr[j][k] = arr[j][i]+arr[i][k];
                        }
                    }
                }
            }
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}