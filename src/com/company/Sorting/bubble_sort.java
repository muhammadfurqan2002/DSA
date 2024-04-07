package com.company.Sorting;

public class bubble_sort {
    public static void sort(int array[]){
        for (int i=0;i< array.length-1;i++){
            for (int j=0;j< array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void display(int array[]){
        for (int x:array){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int array[]={2,1,4,3,6,5,8,7,10,9};
        sort(array);
        display(array);

    }
}
