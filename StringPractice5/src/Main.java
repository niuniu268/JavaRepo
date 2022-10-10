import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String forestr = str.substring(0,3);
        String endstr = str.substring(7);

        String word = "";
        word = forestr + "***" + endstr;
        String word1 = word.replace("123","456");
        System.out.println(word1);




    }
}