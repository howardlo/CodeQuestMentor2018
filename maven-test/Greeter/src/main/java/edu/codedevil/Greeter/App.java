package edu.codedevil.Greeter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Greeting g = new Greeting();
        System.out.println("greetings: " + g.greeting());
    }
}
