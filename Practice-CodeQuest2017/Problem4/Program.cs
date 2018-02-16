using System;
using System.IO;


// Howard: 24:05

namespace Problem4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Problem 4");

            var lines = File.ReadAllLines("./Prob04.in.txt");
            var n = Int32.Parse(lines[0]);

            for(var i=1; i<=n; i++) {
                // Console.WriteLine(lines[i]);
                var max_iterations = Int32.Parse(lines[i]);
                Console.WriteLine( $"fibonacci: {max_iterations} | {fibonacci(0, 1, 1, max_iterations)}");
            }

        }

        static long fibonacci( long a, long b, int iterations, int max_iterations)
        {
            // Console.WriteLine($"\t{a} | {b}");
            if( iterations + 1 > max_iterations) return a;
            return fibonacci(b, a + b, iterations + 1, max_iterations);
        }
    }
}
