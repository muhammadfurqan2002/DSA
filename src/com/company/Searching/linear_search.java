package com.company.Searching;

public class linear_search {

    public static int LinearSearch(int array[],int target){
        for (int i=0;i<array.length;i++){
            if (array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8};
        int n=LinearSearch(array,5);
        System.out.println(n);
    }
}
