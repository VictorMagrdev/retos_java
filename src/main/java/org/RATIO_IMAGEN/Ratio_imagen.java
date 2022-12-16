package org.RATIO_IMAGEN;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class Ratio_imagen {
    public static double obtener_imagen(String link) throws IOException {
        BufferedImage image = null;
        URL url = new URL(link);
        image = ImageIO.read(url);

        double width = image.getWidth();
        double height = image.getHeight();
        double AR = (width / height) * 100;
        return AR;
    }

    public static void main(String[] args) throws IOException {
        String link = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        double ar =obtener_imagen(link);
        System.out.println(ar);
    }
}
