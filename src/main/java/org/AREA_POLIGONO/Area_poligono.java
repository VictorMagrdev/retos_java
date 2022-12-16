package org.AREA_POLIGONO;

public class Area_poligono {
    static int poligono_triangulo(int b, int h){
        int response = 0;
        response = (b*h)/2;
        return response;
    }
    static int poligono_cuadrado(int l){
        int response = 0;
        response = l*l;
        return response;
    }
    static int poligono_rectangulo(int b, int h){
        int response = 0;
        response = b*h;
        return response;
    }
    public static void main(String[] args) {
        int triangulo = poligono_triangulo(2,3);
        int cuadrado = poligono_cuadrado(9);
        int rectangulo = poligono_rectangulo(6,7);
        System.out.println(
                "el area del triangulo es: " + triangulo +
                " el area del cuadrado es: " + cuadrado +
                " el area del rectangulo es: " + rectangulo
        );
    }
}
