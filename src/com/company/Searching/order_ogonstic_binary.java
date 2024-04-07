package com.company.Searching;

public class order_ogonstic_binary {

    public static int binarySearch(int array[],int target){
        int start=0,end=array.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if (array[mid]==target){
                return  mid;
            }
            if (array[mid]>target){
                start=mid+1;
            }else {
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
            int array[]={10,9,8,7,6,5,4,3,2,1};
            int num=binarySearch(array,1);

        System.out.println(num);
    }
}
