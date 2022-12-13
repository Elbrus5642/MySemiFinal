/*Задайте одномерный массив, заполненный случайными числами. 
Найдите сумму элементов, стоящих на нечётных позициях.
[3, 7, 23, 12] -> 19
[-4, -6, 89, 6] -> 0 */

// Метод определения длинны int dimention одномерного массива int GetMatrixDimention (string message)
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
// Метод заполнения одномерного массива случайными числами GetRandomNumberMatrix(dimention)
int[] GetThreeDigitsNumbersMatrix(int number)
{
    int[] matrix = new int[number];
    Random rnd = new Random();

    for (int i = 0; i < number; i++)
    {
        matrix[i] = rnd.Next(-100, 100);
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
// Метод нахождения и визуализации суммы элементов, стоящих на нечётных позициях 1, 3, 5 и т.п.
int GetSumMatrixPositiveNumbers(int[] arr)
{
    int sum = 0;
    for (int i = 1; i < arr.Length; i = i + 2)
    {
        if (i == 1 || i%2 == 1)
        {
            sum = sum + arr[i];
        }
    }
    return sum;
}

//Выполнение программы
int dimention = GetMatrixDimention($"Введите с клавиатуры число, которое определит размерность массива:");
Console.WriteLine($"Размерность массива двухначных чисел в диапазоне от -100 до 100 равна {dimention}");
int[] new_matrix = GetThreeDigitsNumbersMatrix(dimention);
Console.WriteLine($"Собственно вот сам масив:");
PrintTreeDigitsNumbersMatrix(new_matrix);
int sum_positive_numbers = GetSumMatrixPositiveNumbers(new_matrix);
Console.WriteLine($"Сумма чисел стоящих на нечётных позициях в массиве равна: {sum_positive_numbers}");

