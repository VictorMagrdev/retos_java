package org.ANAGRAMA;

import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        boolean result = anagrama("roma", "amor");
        System.out.println(result);
    }
    public static boolean anagrama(String palabra, String comparador) {
        String first = palabra.toLowerCase();
        String second = comparador.toLowerCase();
        if(first.equals(second) || first.length() != second.length()){
            return false;
        }
        int process = 0;
        for(int i = 0; i < first.length(); i++){
            for(int j = 0; j < first.length(); j++){
                if(first.charAt(i) == second.charAt(j)){
                    process++;
                }
            }
        }
        if(process == first.length()){
            return true;
        } else {
            return false;
        }
    }
}