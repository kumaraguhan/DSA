package com.foundationprograms.Strings;

public class allPermutationsofString {
    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
    static void permute(String input, String output){
        if(input.length() == 0){
            System.out.println(output);
        }else{
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                String rem = input.substring(0,i) + input.substring(i+1); 
                permute(rem, output + ch);
            }
        }
    }
}
