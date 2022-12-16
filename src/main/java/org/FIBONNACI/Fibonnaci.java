package org.FIBONNACI;

public class Fibonnaci {
    public static void main(String[] args) {
        int user = 6;
        int j = 0;
        int k = 1;
        int suma = 0;
        for (int i = 0; i <= user; i++){
            System.out.println(suma);
            suma = k+j;
            j = k;
            k = suma;

        }
        System.out.println();
    }
}
