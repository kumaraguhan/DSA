package com.foundationprograms.Strings;

import java.util.*;

public class reverseString {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the String : ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        char[] carr = str.toCharArray();

        for(int i=carr.length -1; i>=0; i--){
            result.append(carr[i]);
        }
        System.out.print(result);
    }
}
