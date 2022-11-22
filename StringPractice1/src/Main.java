import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// watch video https://www.bilibili.com/video/BV17F411T7Ao?p=100 4:44
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input username and password");
        boolean check = false;

        String correctUserName = "user";
        String correctPassWord = "password";

        for (int i = 0; i < 3; i++) {

            String username = scanner.next();
            String password = scanner.next();

            if (username.equals(correctUserName)&&password.equals(correctPassWord)){
                check = true;
                System.out.println("welcome");
                break;
            }else{
                System.out.println("either user name or password is wrong");
            }
        }

        if(check==false){
            System.out.println("more than three times");
        }




    }
}