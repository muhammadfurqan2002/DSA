package com.company.BASIC;

public class basic1 {
    public static void main(String args[]) throws InterruptedException {

        int roll=1454;
        double salary=5464.9;
        String name="Muhammad furqan";
        char letter='f';
        boolean isTrue=true;


        System.out.println(
                roll+""+name
                +""+ salary+""+letter +""+isTrue+"");



        int array[]={1,2,3,4,5,66,};
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }


        for (int x:array){
            System.out.println(x);
        }


        int x=0;
            while (x<5){
                System.out.println(array[x]);
                x++;
            }

            x=0;
        do {
            System.out.println(array[x]);
            x++;

        }while (x<4);


        System.out.println(2==3?"That's true":"Not confirm");


        //type casting in java


        int z=(int)56.56;
        String s=String.valueOf(z);
        char c[]={'c','c','c','c'};
       String e= String.copyValueOf(c);

        System.out.println(e);


        basic1 my=new basic1();
        System.out.println("Waiting here");
        my.greet();


    }


    public int sum(int num1 ,int num2){
        return num1+num2;
    }

    public String fullName(String firstName,String lastName){
        return firstName.concat(lastName);
    }


    public double _Length(double width,double height){
        return width*height;
    }

    public char _Letter(char c){
        return Character.toUpperCase(c);
    }

    public boolean underAge(int age){
        return age>30?true:false;
    }

    public void greet(){
        System.out.println("good morning");
    }
}
