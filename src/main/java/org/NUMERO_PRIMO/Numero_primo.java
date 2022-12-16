package org.NUMERO_PRIMO;

public class Numero_primo {
    static boolean numero_primo(int number){
        if (number < 2 ){
            return false;
        }
        for (int i = 3; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++){
            boolean num = numero_primo(i);
            if (num){
                System.out.printf(String.valueOf(i) +" ");
            }
        }
    }

}
