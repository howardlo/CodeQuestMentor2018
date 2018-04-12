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
            // Print(Board);

            Board[0] = CellState.O;
            Board[1] = CellState.E;
            Board[2] = CellState.X;

            Board[3] = CellState.X;
            Board[4] = CellState.E;
            Board[5] = CellState.X;

            Board[6] = CellState.E;
            Board[7] = CellState.O;
            Board[8] = CellState.O;

            Print(Board);

            var newBoard = new List<CellState>(Board);
            var bestMove = minimax(newBoard, CellState.X);
            Console.WriteLine($"bestMove: {bestMove}");

            Console.ReadLine();
        }



        // Converted javascript from freeCodeCamp
        // https://medium.freecodecamp.org/how-to-make-your-tic-tac-toe-game-unbeatable-by-using-the-minimax-algorithm-9d690bad4b37
        public static int minimax(List<CellState> newBoard, CellState player)
        {
            var availableCellIndices = newBoard.Select((c, i) => new { Value = c, Index = i })
                .Where(e => e.Value == CellState.E).Select(e => e.Index);
            availableCellIndices.ToList().ForEach(e => { Console.WriteLine(e); });

            if (IsWin(newBoard, CellState.O))
            {
                return -10;
            }
            else if (IsWin(newBoard, CellState.X))
            {
                return 10;
            }
            else if (availableCellIndices.Count() == 0)
            {
                return 0;
            }

            var moves = new List<Move>();

            availableCellIndices.ToList().ForEach(e =>
            {
                // Console.WriteLine(e);
                var move = new Move { Index = e };
                newBoard[e] = player;


                if (player == CellState.X)
                {
                    var result = minimax(newBoard, CellState.O);
                    move.Score = result;
                }
                else
                {
                    var result = minimax(newBoard, CellState.X);
                    move.Score = result;
                }

                newBoard[e] = CellState.E;
                moves.Add(move);
            });



            Move bestMove = null;
            if( player == CellState.X)
            {
                var bestScore = -10;
                foreach(var m in moves)
                {
                    if( m.Score > bestScore)
                    {
                        bestScore = m.Score;
                        bestMove = m;
                    }

                }
            }
            else
            {
                var bestScore = 10;
                foreach (var m in moves)
                {
                    if (m.Score < bestScore)
                    {
                        bestScore = m.Score;
                        bestMove = m;
                    }
                }
            }

            return bestMove.Index;
        }

        public class Move
        {
            public int Index;
            public int Score;
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
                if (board.Skip(i).Take(9).Where((e, j) => j % 3 == 0).All(e => e == player)) return true;
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
