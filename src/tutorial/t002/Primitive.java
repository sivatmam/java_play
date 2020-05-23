package tutorial.t002;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class Primitive {
    public static void main(String[] args){
        try{    
        PrintStream ps = new PrintStream(System.out, true, "utf-8");
        
        char a = '\u0905';
        char b = '\u092A';
        char c = '\u092B';
        char d = '\u095D';
        char e = '\u0960';
        
        System.out.println("plain: "+a+b+c+d+e);
        ps.println("devanagari: "+a+b+c+d+e);
        }catch(UnsupportedEncodingException uee){
            System.err.println(uee);
        }

        int x1 = 5_____2;
        System.out.println(x1);
    }
}