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

public class Problem12 {
    public static List<String> lines = null;
    public static void main(String[] args) 
    {
        System.out.println("Problem 12");
        
//        String current = new File(".").getAbsolutePath();
//        System.out.println("Current dir:" + current);
//        Path path = Paths.get(".", "Prob12.in.txt");
//        Charset charset = Charset.forName("ISO-8859-1");
//
//        try {
//            lines = Files.readAllLines(path, charset);
//        } catch (IOException e) {
//            System.out.println(e);
//            System.exit(0);
//        }

        lines = ReadFile("Prob12.in.txt");

        Integer n = Integer.parseInt(lines.get(0));
        System.out.printf("n: %d", n);
    }

    public static List<String> ReadFile(String fileName)
    {
        Path path = Paths.get(".", "Prob12.in.txt");
        Charset charset = Charset.forName("ISO-8859-1");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path, charset);
        } catch (IOException e){
            System.out.printf("Exception: %s%n", e);
        }
        return lines;
    }
}