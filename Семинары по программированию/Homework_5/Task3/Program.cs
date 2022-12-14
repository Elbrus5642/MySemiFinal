/*Задайте массив вещественных чисел.
 Найдите разницу между максимальным и минимальным элементами массива.
[3 7 22 2 78] -> 76
*/

//Метод для определения размерности (dimention_matrix) массива (ввод числа с клавиатуры)
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
// Метод заполнения массива  вещественными случайными числами
double[] GetRealNumberMassiv(int dimention)
{
    double[] matrix_real_numbers = new double[dimention];
    Random rnd = new Random();
    for (int i = 0; i < matrix_real_numbers.Length; i++)
    {
        matrix_real_numbers[i] = rnd.Next(0, 100);
    }
    return matrix_real_numbers;
}
void PrintRealNumberMassiv(double[] arr)
{
    for (int i = 0; i < arr.Length; i++)
    {
        Console.Write($"{arr[i]}");
        Console.WriteLine();
    }
}
// Метод сортировки массива от минимального к максимальному и вычисление разности между минимальныи м и максимальным, визуализация  результата
 (double, double) GetSelectionArray(double[] array)
{
    double min_element;
    double max_element;
    
    for (int i = 0; i < array.Length - 1; i++)
    {
        int minPosition = i;

        for (int j = i + 1; j < array.Length; j++)
        {
            if (array[j] < array[minPosition]) minPosition = j;
        }
        // Перестановка элементов массива через дополнительную переменную
        double temporary = array[i];
        array[i] = array[minPosition];
        array[minPosition] = temporary;
    }
    min_element = array[0];
    max_element = array[array.Length-1];
    
    return  (min_element, max_element);
}

// Основная программа -  решение задачи
int dimention_matrix = GetMatrixDimention($"Введите число, определяющее длину одномерного массива:");
Console.WriteLine($"Задан одномерный вещественный (real) массив длинной {dimention_matrix}");
double[] real_number_massiv = GetRealNumberMassiv(dimention_matrix);
PrintRealNumberMassiv(real_number_massiv);
 //double max_array_element =  GetSelectionArray(real_number_massiv); 
//Console.WriteLine($" Массив длинной {dimention_matrix} с элементами от миеньшего к большему");
//PrintRealNumberMassiv(real_number_massiv);
(double min_array_element, double max_array_element) = GetSelectionArray(real_number_massiv);
Console.WriteLine($" Минимальный элемент массива {min_array_element}");
Console.WriteLine($" Максимальный элемент массива {max_array_element}");
Console.WriteLine($" Разность максимального и минимального элементов  массива {max_array_element - min_array_element}");