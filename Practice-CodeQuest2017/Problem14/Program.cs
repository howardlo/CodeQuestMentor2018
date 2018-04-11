using System;
using System.Collections.Generic;
using System.IO;

namespace Problem14
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Problem 14");
            var lines = File.ReadAllLines("./Prob14.in.txt");
            var n = int.Parse(lines[0]);

            var tree = new Tree<string, string>();

            for(var i=0; i<n; i++) {
                var txt = lines[1+i];
                var token = txt.Split(',');
                var product = token[0];
                var parentProduct = token[1];
                Console.WriteLine($"product: {product} | parent: {parentProduct}");

                if( parentProduct == "None") {
                    tree.Add(parentProduct, new Tree<string, string>());
                }
            }
        }
    }
}

public class Tree<K, V> : Dictionary<K, Tree<K, V>>
{
    public V Value { get; set; }
}
