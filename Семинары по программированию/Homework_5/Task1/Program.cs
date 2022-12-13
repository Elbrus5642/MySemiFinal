/* Задайте массив заполненный случайными положительными 
трёхзначными числами. Напишите программу, 
которая покажет количество чётных чисел в массиве.
[345, 897, 568, 234] -> 2*/

// Метод определения размерности массива (matrix, dimention), печать размерности массива
int GetMatrixDimention(string message)
{
    {
        int result;
        while (true)
        {
            Console.WriteLine(message);
            if (int.TryParse(Console.ReadLine(), out result))
            {
                break;
            }
            else
            {
                Console.WriteLine("Ввели некорректное число, повторите ввод");
            }
        }
        return result;
    }
}
int matrixsize = GetMatrixDimention($"Введите число, которое определит размер массива:");
Console.WriteLine($"Размерность массива {matrixsize}");
// Метод для заполнения массива случайными 3-х значными числами (int GetArrayThreeDigitNumbers (int number) визуализация  массива 
int[] GetThreeDigitsNumbersMatrix(int number)
{
    int[] matrix = new int[number];
    Random rnd = new Random();

    for (int i = 0; i < number; i++)
    {
        matrix[i] = rnd.Next(100, 1000);
    }

    return matrix;
}
void PrintTreeDigitsNumbersMatrix(int[] arr)
{
    for (int i = 0; i < arr.Length; i++)
    {
        Console.Write($"{arr[i]}");
        Console.WriteLine();
    }
}
int[] newMatrix = GetThreeDigitsNumbersMatrix(matrixsize);
Console.WriteLine($"Массив для  подсчёта количества чётных чисел: ");
PrintTreeDigitsNumbersMatrix(newMatrix);
// Метод определения чётное число или нечётное и  GetEvenThreeDigitNumbers(int[] matrix)
int GetEvenThreeDigitNumbers(int[] matrix)
{
    int count = 0;
    for (int i = 0; i < matrix.Length; i++)
    {
        if (matrix[i] % 2 == 0)
        {
            count++;
        }

    }
    return count;
}
//  Определение количества чётных чисел и выод на экран компьютера
int threedigitsnumbersquantity = GetEvenThreeDigitNumbers(newMatrix);
 Console.WriteLine($"Количество чётных чисел в массиве: {threedigitsnumbersquantity}");

