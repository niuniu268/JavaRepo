package com_itheima;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abe");
        arr.add("bcd");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
