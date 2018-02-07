using System;
using System.Collections.Generic;

namespace Special_Problem
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Volunteer days for Howard!");

            var holidays = new List<DateTime>();
            holidays.Add( new DateTime(2018, 3, 30)); // Friday before Easter

            var startDT = new DateTime(2018, 2, 9);
            var endDT = new DateTime(2018, 6, 1); // Just a guess
            Console.WriteLine($"Start: {startDT:dddd, MMM d, yyyy}");
            Console.WriteLine($"End: {endDT:dddd, MMM d, yyyy}");

            List<DateTime> list = new List<DateTime>();
            DateTime dt = startDT;
            while( dt <= endDT)
            {
                list.Add(dt);
                dt = dt.AddDays(14);
            }

            foreach( var xdt in list) {
                Console.WriteLine($"\t{xdt:dddd MMM d, yyyy}");
            }
        }
    }
}
