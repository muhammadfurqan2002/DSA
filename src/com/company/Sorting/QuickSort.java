package com.company.Sorting;

public class QuickSort {
    public static void Sort(int []array,int s,int n){
        if (s<=n){
            int pivot=Pivot(array,s,n);
            Sort(array,s,pivot-1);
            Sort(array,pivot+1,n);
        }
    }


    public static int Pivot(int[]array,int s,int n){
        int pivot=array[s];
        int i=s,j=n;
        while (i<=j){
            if (array[i]<=pivot){
                i++;
            }else if(array[j]>pivot){
                j--;
            }
            if (i<j){
                swap(array,i,j);
            }
        }
        swap(array,s,j);
        return j;
    }
    public static void swap(int[]array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static  void display(int []array){
        for (int x:array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int array[]={2,1,5,4,3,6,7,9,10,8};
        int s=0,n= array.length-1;
        Sort(array,s,n);
        display(array);
    }
}
