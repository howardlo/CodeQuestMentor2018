import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//
// Howard: 17:06
//

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Problem 4");

        Path path = Paths.get(".", "Prob04.in.txt");
        Charset charset = Charset.forName("ISO-8859-1");
        
        try {
            List<String> lines = Files.readAllLines(path, charset);
            int n = Integer.parseInt(lines.get(0));

            for(int i=1; i<=n; i++) {
                int max_iterations = Integer.parseInt(lines.get(i));
                long x = fibonacci(0, 1, 1, max_iterations);
                System.out.printf("fibonacci: %d | %d\n", max_iterations, x);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static long fibonacci( long a, long b, long iterations, long max_iterations)
    {
        // System.out.printf("\t%d | %d%n", a, b);
        if( iterations + 1 > max_iterations) return a;
        return fibonacci(b, a + b, iterations + 1, max_iterations);
    }
}