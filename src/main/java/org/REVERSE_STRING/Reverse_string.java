package org.REVERSE_STRING;

public class Reverse_string {
    public static String reverser(String world){
        String response = "";
        for (int i = world.length() -1; i >= 0; i--) {
            response += (world.charAt(i));
        }
        return response;
    }
    public static void main(String[] args) {
        String word = "hello world";
        System.out.println(reverser(word));
    }
}
