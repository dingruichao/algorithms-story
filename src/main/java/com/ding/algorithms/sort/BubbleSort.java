package com.ding.algorithms.sort;

/**
 * 冒泡排序
 * 有一个大小为 N 的无序序列。冒泡排序就是要每趟排序过程中通过两两比较，找到第 i 个小（大）的元素，将其往上排
 */
public class BubbleSort {
    public static void doBubbleSort(int[] list) {
        int temp = 0; // 用来交换的临时数

        // 要遍历的次数
        for (int i = 0; i < list.length - 1; i++) {
            // 从后向前依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = list.length - 1; j > i; j--) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }

            System.out.format("第 %d 趟：\t", i);
            printIntArray(list);
        }

    }
    public  static void  printIntArray(int[] arr){
        if(arr.length>0){
            String all="";
            for(int i=0;i<arr.length;i++){
                all=all+" "+arr[i];
            }

            System.out.println(all);
        }


    }
    public static void main(String[] args){

        doBubbleSort(new int[]{3,1,7,6,5,9,2});

    }

}
