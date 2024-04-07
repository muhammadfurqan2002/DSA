package com.company.Sorting;

public class Merge_Sort {

    public static void MergeSort(int array[],int s,int n){

        if(s>=n){
            return;
        }
        int mid=s+(n-s)/2;
        MergeSort(array,s,mid);
        MergeSort(array,mid+1,n);
        Sort(array,s,n,mid);
    }

    public static void Sort(int []array,int s,int n,int mid){

        int arr[]=new int[n-s+1];

        int index1=s,x=0;
        int index2=mid+1;
        while (index1<=mid && index2<=n){
            if (array[index1]>array[index2]){
                arr[x++]=array[index2++];
            }else{
               arr[x++]=array[index1++];
            }
        }
        while (index1<=mid){
            arr[x++]=array[index1++];
        }
        while (index2<=n){
            arr[x++]=array[index2++];
        }

        for (int i=0,j=s;i< arr.length;i++,j++){
            array[j]=arr[i];
        }
    }

    public static void display(int array[]){
        for (int x:array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
            int array[]={2,1,4,3,6,5,8,7,10,9};
            int n= array.length-1,s=0;
            MergeSort(array,s,n);
            display(array);
    }
}
