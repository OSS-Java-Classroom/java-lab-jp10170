/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */

public class ColorConverter {

    public static void main(String[] args) {

        String hexColor = "#FF5733";

        Color c = Color.decode(hexColor);
        
        float[] hsbCode = new float[3];
        float [] hsl = new float[3];
        float [] cmyk = new float[3];
        
       

        hsbCode=Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), hsbCode);
        System.out.println("Boja u HEX formatu: 0x"
                + Integer.toHexString(c.getRGB() & 0x00FFFFFF));
        System.out.println("Boja u RGB formatu: " + c.getRed() + ", "
                + c.getGreen() + ", " + c.getBlue());
        System.out.println("Boja u HSB formatu: " + hsbCode[0] * 360 + "°, "
                + hsbCode[1] * 100 + "%, " + hsbCode[2] * 100 + "%");
        hsl = Color.RGBtoHSL(c.getRed(), c.getGreen(), c.getBlue());
        System.out.println("Boja u HSL formatu: " + hsl[0]+ ","
                + hsl[1] + "," + hsl[2]);
        cmyk = Color.RGBtoCMYK(c.getRed(), c.getGreen(), c.getBlue());
        System.out.println("Boja u cymk formatu:"+cmyk[0]+","+cmyk[1]+","+cmyk[2]+","+cmyk[3]);
        int f=Integer.valueOf( "FF", 16 );
        System.out.println(f);
 } 
}

