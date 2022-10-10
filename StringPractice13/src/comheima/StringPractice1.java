package comheima;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        //      watch video https://www.bilibili.com/video/BV17F411T7Ao?p=108
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.next());
        String word = new String();


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) < '0' || str.charAt(i) > '9') {

                System.out.println("input should be number");
                break;
            }

            word = word + convert(str.charAt(i));


        }
        System.out.println(word);

    }

    public static char convert(char charter) {
        char[] group = new char[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        int index = (int) (charter - '0');

        return group[index];

    }
}
