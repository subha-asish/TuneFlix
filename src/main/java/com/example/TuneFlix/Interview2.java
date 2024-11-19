package com.example.TuneFlix;

import java.util.Scanner;

interface calculator{

    int perform(int a , int b);
}


public class Interview2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();
        calculator add = (int x, int y) -> x+y;
        calculator sub = (int x, int y) -> x-y;
        calculator mul = (int x, int y) -> x*y;
        calculator div = (int x, int y) -> x/y;

        if(operator.equals("+")){
            System.out.println(add.perform(a,b));
        }else if(operator.equals("-")){
            System.out.println(sub.perform(a,b));
        }else if(operator.equals("*")){
            System.out.println(mul.perform(a,b));
        }else if(operator.equals("/")){
            System.out.println(div.perform(a,b));
        }else{
            System.out.println("Invalid Operator");
        }
    }
}
