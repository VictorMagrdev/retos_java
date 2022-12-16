package org.CONTADOR_PALABRAS;

public class Contador_palabras {
    public static int contador(String word){
        int response = 0;
        String array[] = word.split(" ");
        response = array.length;
        return response;
    }
    public static void main(String[] args) {
        String j = "este es un ejemplo usado para contar las palabras mediante la funcion contador diseñada para contar palabras";
        System.out.println(contador(j));
    }
}
