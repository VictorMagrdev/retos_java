package org.MORSE;

public class Morse {
    public static String morse(String codigo){
        String response = "";
        for(int i = 0; i < codigo.length();i++) {
            char var = codigo.charAt(i);
            if (var == 'a'){
                response += "._ ";
            }else if (var == 'b'){
                response += "_... ";
            } else if (var == 'c'){
                response += "_._. ";
            } else if (var == 'd'){
                response += "_.. ";
            } else if (var == 'e'){
                response += ". ";
            } else if (var == 'f'){
                response += ".._. ";
            } else if (var == 'g'){
                response += "__. ";
            } else if (var == 'h'){
                response += ".... ";
            } else if (var == 'i'){
                response += ".. ";
            } else if (var == 'j'){
                response += ".___ ";
            } else if (var == 'k'){
                response += "_._ ";
            } else if (var == 'l'){
                response += "._.. ";
            } else if (var == 'm'){
                response += "__ ";
            } else if (var == 'n'){
                response += "_. ";
            } else if (var == 'o'){
                response += "___ ";
            } else if (var == 'p'){
                response += ".__. ";
            } else if (var == 'q'){
                response += "__._ ";
            } else if (var == 'r'){
                response += "._. ";
            } else if (var == 's'){
                response += "... ";
            } else if (var == 't'){
                response += "_ ";
            } else if (var == 'u'){
                response += ".._ ";
            } else if (var == 'v'){
                response += "..._ ";
            } else if (var == 'w'){
                response += ".__ ";
            } else if (var == 'x'){
                response += "_.._ ";
            } else if (var == 'y'){
                response += "_.__ ";
            } else if (var == 'z'){
                response += "__.. ";
            } else if (var == ' '){
                response += " ";
            }
        }
        return response;
    }
    public static void main(String[] args) {
        String hello = "hello world";
        System.out.println(morse(hello));
    }
}
