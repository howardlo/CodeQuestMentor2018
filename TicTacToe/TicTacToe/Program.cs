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

            // TestHorizontalWin();
            // TestVerticalWin();
            // TestDiagnalWin();

            Board.AddRange(new CellState[9]);
            Print(Board);

            Board[0] = CellState.O;
            Board[1] = CellState.E;
            Board[2] = CellState.X;

            Board[3] = CellState.X;
            Board[4] = CellState.E;
            Board[5] = CellState.E;

            Board[6] = CellState.X;
            Board[7] = CellState.O;
            Board[8] = CellState.O;

            Print(Board);
            Console.WriteLine($"is win: {IsWin(Board, CellState.X)}\n");
            var isWin = IsWin(Board, CellState.X);
            if (!isWin)
            {
                var nextBestMove = NextBestMove(Board, CellState.X);
            }


            Console.ReadLine();
        }


        public static int NextBestMove(List<CellState> board, CellState player)
        {
            var count = 0;
            foreach( var c in board)
            {
                Console.WriteLine($"{count} | {c}");
                if( c == CellState.E)
                {
                    var copy = new List<CellState>(board)
                    {
                        [count] = player
                    };
                    Print(copy);
                    var isWin = IsWin(copy, CellState.X);
                    Console.WriteLine($"{count} | is win: {isWin}\n");
                    if (isWin) return count;
                }
                count++;
            }
            return -1;
        }











        public static void TestHorizontalWin()
        {
            var board = new List<CellState>();
            for (var i = 0; i < 9; i++) board.Add(new CellState());
            board[0] = CellState.X;
            board[1] = CellState.X;
            board[2] = CellState.X;

            board[3] = CellState.O;
            board[4] = CellState.O;
            board[5] = CellState.E;

            board[6] = CellState.X;
            board[7] = CellState.E;
            board[8] = CellState.O;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");

            board[0] = CellState.O;
            board[1] = CellState.E;
            board[2] = CellState.X;

            board[3] = CellState.E;
            board[4] = CellState.O;
            board[5] = CellState.O;

            board[6] = CellState.X;
            board[7] = CellState.X;
            board[8] = CellState.X;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");

            board[0] = CellState.E;
            board[1] = CellState.O;
            board[2] = CellState.O;

            board[3] = CellState.X;
            board[4] = CellState.X;
            board[5] = CellState.X;

            board[6] = CellState.E;
            board[7] = CellState.E;
            board[8] = CellState.O;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");
        }

        public static void TestVerticalWin()
        {
            var board = new List<CellState>();
            for (var i = 0; i < 9; i++) board.Add(new CellState());
            board[0] = CellState.X;
            board[1] = CellState.E;
            board[2] = CellState.O;

            board[3] = CellState.X;
            board[4] = CellState.O;
            board[5] = CellState.E;

            board[6] = CellState.X;
            board[7] = CellState.O;
            board[8] = CellState.X;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");

            board[0] = CellState.X;
            board[1] = CellState.O;
            board[2] = CellState.X;

            board[3] = CellState.E;
            board[4] = CellState.O;
            board[5] = CellState.X;

            board[6] = CellState.O;
            board[7] = CellState.E;
            board[8] = CellState.X;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");

            board[0] = CellState.O;
            board[1] = CellState.X;
            board[2] = CellState.O;

            board[3] = CellState.O;
            board[4] = CellState.X;
            board[5] = CellState.O;

            board[6] = CellState.E;
            board[7] = CellState.X;
            board[8] = CellState.E;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");
        }

        public static void TestDiagnalWin()
        {
            var board = new List<CellState>();
            for (var i = 0; i < 9; i++) board.Add(new CellState());
            board[0] = CellState.X;
            board[1] = CellState.O;
            board[2] = CellState.X;

            board[3] = CellState.O;
            board[4] = CellState.X;
            board[5] = CellState.E;

            board[6] = CellState.X;
            board[7] = CellState.E;
            board[8] = CellState.O;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");

            board[0] = CellState.X;
            board[1] = CellState.O;
            board[2] = CellState.X;

            board[3] = CellState.E;
            board[4] = CellState.X;
            board[5] = CellState.O;

            board[6] = CellState.O;
            board[7] = CellState.E;
            board[8] = CellState.X;

            Print(board);
            Console.WriteLine($"is win: {IsWin(board, CellState.X)}\n");
        }

        public static bool IsWin(List<CellState> board, CellState player)
        {
            return IsHorizontalWin(board, player) 
                || IsVerticalWin(board, player) 
                || IsDiagonalWin(board, player);
        }

        public static bool IsDiagonalWin(List<CellState> board, CellState player)
        {
            var list = new List<CellState>
            {
                board[0],
                board[4],
                board[8]
            };
            if (list.All(e => e == player)) return true;

            list.Clear();
            list.Add(board[2]);
            list.Add(board[4]);
            list.Add(board[6]);
            if (list.All(e => e == player)) return true;

            return false;
        }

        public static bool IsVerticalWin(List<CellState> board, CellState player)
        {
            for (var i = 0; i < 3; i++)
            {
                if (board.Skip(i).Take(9).Where((e, j) => j%3 == 0).All(e => e == player)) return true;
            }

            return false;
        }

        public static bool IsHorizontalWin(List<CellState> board, CellState player)
        {
            for (var i = 0; i < 9; i += 3)
            {
                if (board.Skip(i).Take(3).All(e => e == player)) return true;
            }
            return false;
        }

        public static void Print(List<CellState> board)
        {
            var count = 0;
            board.ForEach(c => { Console.Write(count++ % 3 == 2 ? $"{c} \n" : $"{c} "); });
            Console.WriteLine("- - -");
        }
    }
}
