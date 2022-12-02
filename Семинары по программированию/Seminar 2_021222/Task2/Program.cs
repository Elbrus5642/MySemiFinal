/* Напишите программу, 
которая будет принимать на вход два числа и выводить, 
является ли второе число кратным первому. 
Если число 2 не кратно числу 1, 
то программа выводит остаток от деления.

34, 5 -> не кратно, остаток 4 
16, 4 -> кратно
*/

//string numbeStr = Console.ReadLine() ??"";
Console.WriteLine("Введите первое число: ");
int  numberOne = int.Parse(Console.ReadLine() ??"");
Console.WriteLine("Введите второе число: ");
int  numberTwo = int.Parse(Console.ReadLine() ??"");

if (numberOne % numberTwo == 0)
{
   Console.WriteLine($"Первое число {numberOne} кратно второму {numberTwo}"); 
  
}
else
{
    int ost = numberOne % numberTwo;
   Console.WriteLine($"Первое число {numberOne}"+ 
   $" не кратно второму {numberTwo} , остаток от деления {ost}");  
}
