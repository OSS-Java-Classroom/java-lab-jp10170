/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Color {
    int r;
    int g;
    int b;
    public Color(int r, int g, int b) {
        this.r=r;
        this.g=g;
        this.b=b;
    }
    static Color decode(String hexcolor) {
       int r=Integer.valueOf( hexcolor.substring( 1, 3 ), 16 );
       int g=Integer.valueOf( hexcolor.substring( 3, 5 ), 16 );
       int b=Integer.valueOf( hexcolor.substring( 5, 7 ), 16 );
       return new Color(r,g,b);
    }
    public static float[] RGBtoHSB(int a, int d, int c,float hsbvals[]) 
    { 
  
        // R, G, B values are divided by 255 
        // to change the range from 0..255 to 0..1 
        float r = (float) (a/ 255.0);
        float g = (float) (d / 255.0); 
        float b = (float) (c / 255.0);
        
  
        // h, s, v = hue, saturation, value 
        float cmax = Math.max(r, Math.max(g, b)); // maximum of r, g, b 
        float cmin = Math.min(r, Math.min(g, b)); // minimum of r, g, b 
        float diff = cmax - cmin; // diff of cmax and cmin. 
        float h = (float) -1.0, s = (float) -1.0; 
          
        // if cmax and cmax are equal then h = 0 
        if (cmax == cmin) 
            h = 0; 
  
        // if cmax equal r then compute h 
        else if (cmax == r) 
            h = (60 * ((g - b) / diff) + 360) % 360 / 360; 
  
        // if cmax equal g then compute h 
        else if (cmax == g) 
            h = (60 * ((b - r) / diff) + 120) % 360 / 360; 
  
        // if cmax equal b then compute h 
        else if (cmax == b) 
            h = (60 * ((r - g) / diff) + 240) % 360 / 360; 
  
        // if cmax equal zero 
        if (cmax == 0) 
            s = 0; 
        else
            s = (diff / cmax); 
  
        // compute v 
        float v = cmax;
        float[] hsbvalues={h,s,v};
        hsbvals=hsbvalues;
        return hsbvals;   
    }
    public static float[] RGBtoHSL(int a, int d, int c) 
    { 
  
        // R, G, B values are divided by 255 
        // to change the range from 0..255 to 0..1 
        float r = (float) (a/ 255.0);
        float g = (float) (d / 255.0); 
        float b = (float) (c / 255.0);
        
  
        // h, s, v = hue, saturation, value 
        float cmax = Math.max(r, Math.max(g, b)); // maximum of r, g, b 
        float cmin = Math.min(r, Math.min(g, b)); // minimum of r, g, b 
        float diff = cmax - cmin; // diff of cmax and cmin. 
        float h = (float) -1.0, s = (float) -1.0; 
          
        // if cmax and cmax are equal then h = 0 
        if (cmax == cmin) 
            h = 0; 
  
        // if cmax equal r then compute h 
        else if (cmax == r) 
            h = (60 * ((g - b) / diff) + 360) % 360; 
  
        // if cmax equal g then compute h 
        else if (cmax == g) 
            h = (60 * ((b - r) / diff) + 120) % 360; 
  
        // if cmax equal b then compute h 
        else if (cmax == b) 
            h = (60 * ((r - g) / diff) + 240) % 360; 
        float l = (cmax+cmin)/2;   
        // if cmax equal zero 
        if (cmax == 0) 
            s = 0; 
        else
            s = diff / (1 - Math.abs(2 * l - 1))*100;
        l=l*100;
        float[] hsl_form = {h,s,l};
        return hsl_form;
        
    }
    public static float[] RGBtoCMYK(int a, int d, int l)
    {
        float r = (float) (a/ 255.0);
        float g = (float) (d / 255.0); 
        float b = (float) (l / 255.0);
        float black = 1-Math.max(r,Math.max(g,b));
        float c=(1-r-black)/(1-black);
        float m=(1-g-black)/(1-black);
        float y=(1-b-black)/(1-black);
        c=c*100;
        m=m*100;
        y=y*100;
        black=black*100;
        float cmyk[] = {c,m,y,black};
        return cmyk;
    }
    public int getRed()
    {
        return this.r;
    }
    public int getGreen()
    {
        return this.g;
    }
    public int getBlue()
    {
        return this.b;
    }
    public int getRGB()
    {
       int RGB = (this.r*65536)+(this.g*256)+this.b;
       return RGB;
    }
    
}
