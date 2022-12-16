package org.DECIMAL_TO_BINARI;

import java.util.LinkedList;

public class Decimal_to_binari {
    public static LinkedList<Integer> binario(int bin) {
        LinkedList<Integer> response = new LinkedList<>();
        int num = bin;
        int m;
        do {
            m = num % 2 ;
            response.push(m);
            num /= 2;
        } while (num > 0);
        return response;
    }
    public static void main(String[] args) {
        int bin = 8;
        LinkedList<Integer> resul = binario(bin);
        for(int i = 0; i < resul.size(); i++){
            System.out.println(resul.get(i));
        }
    }
}
