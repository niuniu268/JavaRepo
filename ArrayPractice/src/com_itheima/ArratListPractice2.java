package com_itheima;

import java.util.ArrayList;

public class ArratListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);

        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+"; ");
            }
        }


    }
}
