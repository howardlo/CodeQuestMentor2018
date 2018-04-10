import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.io.*;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println("Problem 15");
        
        String current = new File(".").getAbsolutePath();
        System.out.println("Current dir:" + current);

        Path path = Paths.get(".", "Prob15.in.txt");

        Charset charset = Charset.forName("ISO-8859-1");

        try {
            List<String> lines = Files.readAllLines(path, charset);
            int count = 0;
            for(String l : lines) {
                if( count > 0 && count < 2) {
                    System.out.println(l);
                    GetHand(l);
                }
                count++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void GetHand(String txt)
    {
        Dictionary d = new Hashtable();
        char[] list = txt.toCharArray();
        for(char c: list)
        {
            d.put( c, )
            System.out.print(c);
        }
    }
}