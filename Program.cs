using System;

namespace QuizGame
{
    class Program
    {
        static void Main(string[] args)
        {
            int lives = 3;
            string correctAnswer = "Anders Hejlsberg";
            string answer;


            while (lives > 0)
            {
                Console.WriteLine("\nLife: " + lives);
                Console.WriteLine("Who is the creator of C#?");
                Console.WriteLine();
                Console.Write("Answer: ");
                answer = Console.ReadLine();

                if (answer.Equals(correctAnswer, StringComparison.OrdinalIgnoreCase)) // Case-insensitive comparison
                {
                    Console.WriteLine("\nYou Win!");
                    Console.WriteLine();
                    Console.ReadKey();
                }
                else
                {
                    lives--;
                    if (lives > 0)
                    {
                        Console.WriteLine("In!correct answer. \nLives remaining: " + lives);
                    }
                }
            }

            if (lives == 0)
            {
                Console.WriteLine("\nYou Lose");
                Console.WriteLine();
                Console.ReadKey();
            }
        }
    }
}