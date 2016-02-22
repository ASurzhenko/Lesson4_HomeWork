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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words through commas: ");
        String words = scanner.nextLine();

        String[] sp = words.split(",");

        int count = 0;
        for (int i = 0; i < sp.length; i++) {
            if (searchForPalindrom(sp[i])) {
                count++;
            }
        }

        System.out.println("There are " + count + " palindromes in the text");
    }

    private static boolean searchForPalindrom(String sp) {
        sp = sp.trim();
        StringBuffer sb = new StringBuffer(sp);
        String reverse = sb.reverse().toString();

        return (sp.equals(reverse));
    }
}
