/* Напишите программу, 
которая принимает на вход число и проверяет, кратно ли оно одновременно 
7 и 23.

14 -> нет 
46 -> нет 
161 -> да
*/
Console.WriteLine("Введите число: ");
int  numberOne = int.Parse(Console.ReadLine() ??"");
if (numberOne % 7 == 0  &&  numberOne % 23 == 0)
{
  Console.WriteLine($"Число {numberOne} делится на 7 и на 23");  
}
else
{
  Console.WriteLine($"Число {numberOne}  не делится на 7 и на 23");  
}


