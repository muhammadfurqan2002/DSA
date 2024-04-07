package com.company.Sorting;

public class Selection_Sort {


    public  static void SelectionSort(int array[]){
        for (int i=0;i< array.length-1;i++){
            int x=i;
            for (int j=i+1;j< array.length;j++){
                if (array[x]>array[j]){
                    x=j;
                }
            }
            int temp=array[i];
            array[i]=array[x];
            array[x]=temp;
        }
    }

    public static void display(int array[]){
        for (int x:array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int array[]={2,1,4,3,6,5,8,7,10,9};
        SelectionSort(array);
        display(array);
    }
}
