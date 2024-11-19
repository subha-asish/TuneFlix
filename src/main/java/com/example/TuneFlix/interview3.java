package com.example.TuneFlix;

import com.example.TuneFlix.Entity.Channel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class interview3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0; i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }else{
                hm.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            System.out.print(entry.getKey()+"->"+ entry.getValue()+ " ");
        }
    }
}
