import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Problem 1");

        Path path = Paths.get(".", "Prob01.in.txt");
        Charset charset;
        // charset = Charset.forName("US-ASCII");
        charset = Charset.forName("ISO-8859-1");

        try {
            List<String> lines = Files.readAllLines(path, charset);
            for(String l : lines) {
                System.out.println(l);
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}