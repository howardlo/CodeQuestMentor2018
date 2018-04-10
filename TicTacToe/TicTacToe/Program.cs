using System;
using System.Collections.Generic;
using System.Linq;

namespace TicTacToe
{
    class Program
    {
        public enum CellState
        {
            E, O, X
        }

        public static List<CellState> Board = new List<CellState>();

        static void Main(string[] args)
        {
            Console.WriteLine("Hi there playing Tic Tac Toe");
            // 012
            // 345
            // 678

            for(var i=0; i<9; i++)
            {
                Board.Add(new CellState());
            }
            Print(Board);

            Board[0] = CellState.O;
            Board[1] = CellState.E;
            Board[2] = CellState.O;

            Board[3] = CellState.X;
            Board[4] = CellState.E;
            Board[5] = CellState.E;

            Board[6] = CellState.X;
            Board[7] = CellState.O;
            Board[8] = CellState.O;

            Print(Board);
            var win = Win(Board, CellState.O);


            Console.ReadLine();
        }
        public static bool Win( List<CellState> board, CellState player)
        {
            foreach( var move in board.Where( e => e == CellState.E)) {
            }
            return false;
        }

        public static bool IsWin( List<CellState> board, CellState player)
        {
            for(var i=0; i<9; i += 3 )
            {
                if (board.Skip(i).Take(3).All(e => e == player)) return true;
            }
            for(var i=0; i<3; i ++ )
            {
                for (var j = 0; j < 9;  j += 3)
                {
                    board.Skip(i);
                }
            }

        }

        public static void Print( List<CellState> board)
        {
            var count = 0;
            foreach(var c in board)
            {
                Console.Write($"{c} ");
                if (count++ % 3 == 2) Console.WriteLine();
            }
            Console.WriteLine("- - -");
        }
    }
}
