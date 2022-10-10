package com_itheima.ArrayListPractice4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice4 {
    public static void main(String[] args) {
        ArrayList<UserInfo> list = new ArrayList<>();

        UserInfo u1 = new UserInfo("111", "asv", "123456");
        UserInfo u2 = new UserInfo("222", "asv", "123456");
        UserInfo u3 = new UserInfo("333", "asv", "123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println(check(list, id));


    }

    public static int check(ArrayList<UserInfo> list, String id) {

        int num = -1;


        for (int i = 0; i < list.size(); i++) {
            UserInfo listId = list.get(i);
            if (listId.getId().equals(id)) {
                return i;

            }

        }
        return -1;
    }
}
