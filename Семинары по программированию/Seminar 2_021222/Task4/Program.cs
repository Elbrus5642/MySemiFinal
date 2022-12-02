/*Напишите программу, которая принимает 
на вход два числа и проверяет, 
является ли одно число квадратом другого.

5, 25  ->  да
-4, 16  ->  да
25, 5  ->  да
8,9  ->  нет
*/

int GetNumberFromConsole(string message)
   {
      Console.WriteLine($"{message}");
      string numberSrt =  Console.ReadLine() ??"";
      int number = int.Parse(numberSrt);
      return number;
   }

string IsItSquare( int numberOne, int numberTwo)
{
    if (numberOne == numberTwo*numberTwo)
           return "Yes";     
    else
           return "No";
 }

int numberOne = GetNumberFromConsole("Введите первое число:");
int numberTwo = GetNumberFromConsole("Введите второе число:");

Console.WriteLine(IsItSquare(numberOne, numberTwo));