/*
Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
Определить количество таких слов в тексте, в котором все слова введены через запятую.

Пример ввода:
deleveled, evitative, cat, dog, deified
Результат:
There are 3 palindromes in the text

PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа
*/

import java.util.Scanner;

/**
 * Created by Александр on 22.02.2016.
 */
public class HomeWork3 {
    public static void main(String[] args) {

        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words through comma: ");
        String words = scanner.nextLine();

        String reverce = new StringBuffer(words).reverse().toString();
        if (words.equals(reverce)) {
            sum ++;
        }




        System.out.println(reverce);









    }

}
