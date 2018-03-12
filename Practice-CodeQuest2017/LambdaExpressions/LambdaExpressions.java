import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Howard 21:31

public class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println("Lambda Expressions");

        String[] list = {
            "The",
            "lazy",
            "dog",
            "jumped",
            "over",
            "the",
            "quick",
            "brown",
            "fox"
        };

        for( String s: list) {
            System.out.println(s);
        }

        Predicate<string> containsCaps = p -> p.

        for( String s: containsCaps) {
            System.out.println(s);
        }

    }
}