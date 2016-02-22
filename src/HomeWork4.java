/*
Создайте класс в котором будут 2 статических метода:
- перевод числа из 2ой в 10ную систему счисления
- перевод числа из 10ной в 2ную систему счисления
В методе main другого класса дайте возможность пользователю выбрать, что он хочет делать
из 2х вариантов и вызовите соответствующую функцию.

Пример ввода:
Choose the option:
1 - Convert a number from binary to denary
2 - Convert a number from denary to binary
Enter: 2
Number: 12
Результат:
1100

 */

import java.util.Scanner;

/**
 * Created by Александр on 22.02.2016.
 */
public class HomeWork4 {
    public static void main(String[] args) {

        int choise, number;

        System.out.println("Choose the option:");
        System.out.println("1 - Convert a number from binary to denary");
        System.out.println("2 - Convert a number from denary to binary");
        Scanner scanner = new Scanner(System.in);
        choise = scanner.nextInt();
        System.out.println("Enter the number to convert:");
        number = scanner.nextInt();

        if (choise == 1) {
            convertFromBinaryToDenary(number);
        } else if (choise == 2) {
            convertFromDenaryToBinary(number);
        } else {
            System.out.println("Somthing is wrong. Try again later.");
        }
    }

    private static void convertFromBinaryToDenary(int number) {

        int[] array = new int[50];
        for (int i = 0; number > 0; i++) {
            array[i] = number % 10;
            number /= 10;
        }

        int res = 0;
        int size = array.length;
        for (int i = size - 1; i > 0; i--) {
            res += Math.pow(2, i) * array[i];
        }
        System.out.println(res);
    }

    private static void convertFromDenaryToBinary(int number) {

        int[] array = new int[50];
        int i = 0;
        for (; number > 0; i++) {
            array[i] = number % 2;
            number /= 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(array[j]);
        }
    }
}