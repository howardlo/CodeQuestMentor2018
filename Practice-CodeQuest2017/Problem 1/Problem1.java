import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Problem 1");

        Path path = Paths.get("C:/Users/Howard/Source/Repos/CodeQuestMentor2018/Practice-CodeQuest2017/Problem 1", "Prob01.in.txt");
        Charset charset = Charset.forName("ISO-8859-1");

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