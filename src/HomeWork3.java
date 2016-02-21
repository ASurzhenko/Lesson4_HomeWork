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
        System.out.println("Enter some words through comma: ");
        String words = scanner.nextLine();
     //   String[] array = words.split(",");
     //   String firstHalf = words.substring(0, words.length() / 2);
     //   String secondHalf = words.substring(words.length() / 2);
        String reverce = new StringBuffer(words).reverse().toString();
      //  String concat = firstHalf.concat(reverce);


       /* System.out.println(words.substring(0, words.length() / 2));
        System.out.println(words.substring(words.length() / 2));*/
        System.out.println(reverce);
       /* System.out.println(concat);*/




       /* String sub = words.substring(words.length() / 2);
        String secondHalf = sub*/




       /* for (int i = 0; i < array.length; i++) {
            ifTheWordPalindrom(array);

        }

    }

    private static void ifTheWordPalindrom(String array[]) {
        System.out.println(Arrays.toString(array));*/

    }
}
