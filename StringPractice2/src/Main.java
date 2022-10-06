import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//watch video https://www.bilibili.com/video/BV17F411T7Ao?p=101
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int capitalcount = 0;
        int smallcount = 0;
        int numcount = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           char chart = str.charAt(i);
           if(chart >= 'a' && chart <= 'z'){

               smallcount++;
           } else if (chart >= 'A' && chart <= 'Z') {
               capitalcount++;

           } else if (chart >= '0' && chart <= '9') {
               numcount++;
               int num = (int)chart;
               sum += num;
           }


        }
    }
}