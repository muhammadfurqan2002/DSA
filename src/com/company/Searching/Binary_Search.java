package com.company.Searching;

public class Binary_Search {


    public static int binarySearch(int array[],int target){
        int s=0,e= array.length-1;

        int mid=s+(e-s)/2;

        while (s<=e){
            if (array[mid]==target){
                return mid;
            }
            if (array[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int s=binarySearch(array,9);
        System.out.println(s);
    }
}




