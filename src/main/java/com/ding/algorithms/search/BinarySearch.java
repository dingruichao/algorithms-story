package com.ding.algorithms.search;

/**
 * 二分查找  对数据的要求是有序  这里按默认从小到大排序
 */

public class BinarySearch {


    /**
     * 不使用递归的二分查找  要求数据是按从小到大排序好
     *title:commonBinarySearch
     *@param arr
     *@param key
     *@return 关键字位置
     */
    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;			//定义middle

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){
                //比关键字大则关键字在左区域
                high = middle - 1;
            }else if(arr[middle] < key){
                //比关键字小则关键字在右区域
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;		//最后仍然没有找到，则返回-1
    }
    /**
     * 使用递归的二分查找  要求数据是按从小到大排序好
     *title:recursionBinarySearch
     *@param arr 有序数组
     *@param key 待查找关键字
     *@param low 数组低位
     *@param high 数组高位
     *@return 找到的位置
     */
    public static int recursionBinarySearch(int[] arr,int key,int low,int high){

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        int middle = (low + high) / 2;			//初始中间位置
        if(arr[middle] > key){
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        }else if(arr[middle] < key){
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        }else {
            return middle;
        }

    }


    public static void main(String[] args){

        System.out.println(commonBinarySearch(new int[]{2,3,8,19,24,33,44,56,77},19));
        System.out.println(recursionBinarySearch(new int[]{2,3,8,19,24,33,44,56,77},19,0,8));
    }

}
