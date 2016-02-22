/*
Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы,
но также в возрастающем порядке.

Пример ввода:
a = {1, 3, 5}
b = {2, 4, 8, 9, 12}
Результат:
c = {1, 2, 3, 4, 5, 8, 9, 12}
*/

import java.util.Scanner;

/**
 * Created by Александр on 22.02.2016.
 */
public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size1 = 3, size2 = 5;
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] arrayMix = new int[size1 + size2];
        int a;

        System.out.println("Enter the numbers for the first array:");
        for (int element : array1) {
            a = scanner.nextInt();
            array1[element] = a;
        }

        System.out.println("Enter the numbers for the second array:");
        for (int i = 0; i < size2; i++) {
            a = scanner.nextInt();
            array2[i] = a;
        }

        for (int i = 0, j = 0; i < size1 + size2; i++) {
            if (i < size1) {
                arrayMix[i] = array1[i];
            } else {
                arrayMix[i] = array2[j];
                j++;
            }
        }

        sortOfArrayMix(arrayMix);
        printArray(arrayMix, arrayMix.length);
    }

    private static void sortOfArrayMix(int[] arrayMix) {

        for (int i = 0; i < arrayMix.length; i++) {
            int min = arrayMix[i];
            int min_index = i;
            for (int j = i + 1; j < arrayMix.length; j++) {
                if (arrayMix[j] < min) {
                    min = arrayMix[j];
                    min_index = j;
                }
            }
            int buf = arrayMix[i];
            arrayMix[i] = arrayMix[min_index];
            arrayMix[min_index] = buf;
        }
    }

    private static void printArray(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
