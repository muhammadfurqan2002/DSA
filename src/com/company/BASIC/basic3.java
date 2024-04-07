package com.company.BASIC;

import java.lang.reflect.Array;

public class basic3 {
    public static void main(String[] args) {
        Arrays_String_Methods obj=new Arrays_String_Methods();
        obj.Methods();
    }
    static class Arrays_String_Methods{
        void Methods(){
            int array[]={1,2,34,5,6,7,8};

            if(array.length>10){
                for(int i=0;i<5;i++){
                    System.out.println("Good morning");
                    if(i==2){
                        break;
                    }

                }
            }else{
                switch (array[0]){
                    case 1:
                        for (int x:array){
                            if (x==2){
                                continue;
                            }
                            System.out.println(x);

                        }
                        break;
                    default:
                        System.out.println("Hope you are well");
                        break;
                }
            }
        }
    }
}
