/*
i18n используется для обозначения слова internationalization, где 18 означает количество
букв между первой и последней в этом слове, такое можно встретить в среде разработчиков.
Например, для слова localization используется сокращение l10n.
Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму.
Слова длиной меньше 4х оставить без изменений.

Пример ввода:
internationalization localization cat elephant monitor
Результат:
i18n l10n cat e6t m5r

PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который
поместит слова в массив и для каждого из них вызовет вашу функцию
*/


import java.util.Scanner;

/**
 * Created by Александр on 21.02.2016.
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words through space: ");
        String words = scanner.nextLine();

        String[] sp = words.split(" ");

        for (int i = 0; i < sp.length; i++) {
            reduction(sp[i]);
        }
    }

    private static void reduction(String sp) {
        if (sp.length() > 3) {
            System.out.print(sp.charAt(0));
            System.out.print((sp.length() - 2));
            System.out.print(sp.charAt(sp.length() - 1));
            System.out.print(" ");
        } else {
            System.out.print(sp + " ");
        }
    }
}
