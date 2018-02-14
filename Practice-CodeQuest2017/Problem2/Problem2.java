import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Howard 21:31

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Problem 2");

        Path path = Paths.get("C:/Users/Howard/Source/Repos/CodeQuestMentor2018/Practice-CodeQuest2017/Problem2", "Prob02.in.txt");
        Charset charset = Charset.forName("ISO-8859-1");

        try {
            List<String> lines = Files.readAllLines(path, charset);
            Integer n = Integer.parseInt(lines.get(0));
            System.out.println(n);
            for(int i=1; i<=n; i++) { 
                String l = lines.get(i);
                String[] lineParts = l.split(" ");
                Integer offset = Integer.parseInt(lineParts[1]);    
                // System.out.printf("%d %s%n", offset, lineParts[0]);
                String[] charArray = lineParts[0].split("(?!^)");
                for(int j=0; j<charArray.length; j++) {
                    if( j != offset) System.out.printf("%s", charArray[j]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}