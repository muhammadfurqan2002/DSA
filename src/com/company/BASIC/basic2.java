package com.company.BASIC;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class basic2 {






    public int[] sortedArray(int []array){

        Arrays.sort(array);
        return array;
    }


    public String[] sortedName(String [] names){
        for (int i=0;i< names.length-1;i++){
            for(int j=0;j< names.length-i-1;j++){
                if (names[j].compareToIgnoreCase(names[j+1])>0){
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        return names;
    }


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        boolean isTrue=true;
//        String name;
//
//        while (isTrue){
//            System.out.println("Enter Your name");
//            name=sc.nextLine();
//            if(name.compareToIgnoreCase("furqan")==0){
//                isTrue=false;
//            }else{
//                System.out.println("try again");
//            }
//        }


//        Random r=new Random();
//        int random=r.nextInt(100);
//
//        System.out.println(random);







    }
}
