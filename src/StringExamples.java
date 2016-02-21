/**
 * Created by Александр on 21.02.2016.
 */
public class StringExamples {
    public static void main(String[] args) {

        String str = "blue";
        String str1 = new String("some string");

        char symbol = str.charAt(3); //Show letter 3 by index from 0 (e)
        System.out.println(symbol);

        int sum = getNumberOfSymbols('s', str1); //Count some letters in the String
        System.out.println("Number of s in " + str1 + " is " + sum);

        String str2 = str.concat(" cat"); //Concat " cat" with str variable
        System.out.println("Concat strings: " + str2);

        String str3 = str + " dog"; //Concat with +
        System.out.println("Concat with +: " + str3);

        String str4 = "\"Animal\""; //Show quotes
        System.out.println(str4);

        String str5 = "Word with spaces";
        System.out.println(str5.trim()); //Delete spaces

        String str6 = str5.replace("with", "something"); //Change "with" to "something"
        System.out.println("Replace example: " + str6);

        //5 - inclusive, 10 - exclusive
        String str7 = str5.substring(5, 10); //Shows letters from 5 to 10
        System.out.println("Substring example: " + str7);

        String[] str8 = str6.split(" ");
        System.out.println(str8);
    }

    private static int getNumberOfSymbols(char symbol, String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol) {
                sum++;
            }
        }
        return sum;
    }
}

