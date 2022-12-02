/* Напишите программу, которая выводит случайное трехзначное число и удаляет вторую цифру этого числа.

456 -> 46
782 -> 72
918 -> 98

*/
Random rnd =  new Random();
int result = rnd.Next(100,1000);
Console.WriteLine($"Вывод случайного числа {result}");

int hundreds =  result / 100;
int ones  = result / 10;

int newnumber = hundreds*10 + ones;
Console.WriteLine()
