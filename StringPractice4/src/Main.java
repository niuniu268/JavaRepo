import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = new String[7];
        String tmp = "";

        for (int i = 6; i > -1; i--) {
            arr[i] = cal(num);
        }

        for (int i = 0, j = arr.length; i > j ;) {

            tmp= arr[i];
            arr[i] =arr[j];
            arr[j] = tmp;

            i++; j--;

        }

        System.out.println(arr[0]+" hundred,"+arr[1]+" ten,"+arr[2]+" ten thousand," + arr[3] + " thousand," + arr[4]+ " hundred,"+arr[5] + " ten, "+ arr[6]+" yuan,");




    }
    public  static  String cal (int num){
        int num1 = num%10;
        String w = "";
        switch (num1){
            case 0 ->  w = "Zero";
            case 1 ->  w = "one";
            case 2 ->  w = "two";
            case 3 ->  w = "three";
            case 4 ->  w = "four";
            case 5 ->  w = "five";
            case 6 ->  w = "six";
            case 7 ->  w = "seven";
            case 8 ->  w = "eight";
            case 9 ->  w = "nine";
        }
        return w;
    }
}