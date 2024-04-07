package com.company.BASIC;

public class basic4 {


    int sum(int a){
        return a+10;
    }

    int sum(int a ,int b){
        return a+b;
    }

    int sum(int a ,int b,int c){
        return a+b;
    }

    public static void main(String[] args) {
            int array[]={1,2,3,4,5,6};
            Print(array,0);
    }

    public static void Print(int array[],int index){
        if (index== array.length){
            return;
        }
        Print(array,index+1);

        System.out.println(array[index]);
    }
}
