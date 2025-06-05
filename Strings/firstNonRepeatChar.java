package com.foundationprograms.Strings;

import java.util.*;

public class firstNonRepeatChar {
    public static void main(String[] args) {
        String str = "Java is job giving Language";
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }
            else
            {
                hm.put(str.charAt(i), 1);
            }
        }
        
        Set<Character> set = hm.keySet();
        
        for(Character ch : set){
            if(hm.get(ch) == 1){
                System.out.print(ch);
                return;
            }
        }

//        for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            if(hm.get(ch) == 1){
//                System.out.println(ch);
//                return;
//            }
//        }
    }
}
