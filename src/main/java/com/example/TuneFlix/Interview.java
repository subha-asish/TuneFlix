package com.example.TuneFlix;

import java.util.Scanner;
import java.util.Stack;

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(isValid(str));

    }
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if(str.charAt(i)==')' && ch != '(' ) return false;
                if(str.charAt(i)==']' && ch != '[' ) return false;
                if(str.charAt(i)=='}' && ch != '{' ) return false;
            }
        }
        return st.isEmpty();
    }
}
