﻿using System;
using System.IO;

namespace Problem2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Problem 2");
            var lines = File.ReadAllLines("./Prob02.in.txt");

            foreach(var l in lines) {
                Console.WriteLine(l);
            }
        }
    }
}
