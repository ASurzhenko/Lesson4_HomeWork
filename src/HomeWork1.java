/*
Напишите программу, которая заменяет символы в почтовом адресе пользователя:
@ заменяется на [ at ]
        . заменяется на [ dot ]

        Пример ввода:
        person@gmail.com
Результат:
        person[ at ]gmail[ dot ]com
*/

import java.util.Scanner;

/**
 * Created by Александр on 21.02.2016.
 */
public class HomeWork1 {
    public static void main(String[] args) {

        String email, change;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter e-mail, please: ");
        email = scanner.next();

        change = email.replace("@", "[ at ]");
        change = change.replace(".", "[ dot ]");
        System.out.println(change);
    }
}
