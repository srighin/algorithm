package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddOneToList {
    public static void main(String[] args) {
        List<Integer> number = new LinkedList<>();
        number.add(9);
        number.add(9);
        number.add(9);
        number.add(9);

        System.out.println(number);

        List<Integer> resultList = new LinkedList<>();

        Collections.reverse(number);

        //System.out.println(number);
        boolean flag = true;
        Integer carry = 0;
        for (Integer num : number) {
            if (flag) {
                num = num + 1;
                if (num >= 10) {
                    carry = num / 10;
                    num = num % 10;
                }
                resultList.add(num);
                flag = false;
            } else {
                num = num + carry;
                carry = num / 10;
                num = num % 10;
                resultList.add(num);
            }
        }
        if (carry == 1) {
            resultList.add(carry);
        }
        //  System.out.println(resultList);
        Collections.reverse(resultList);

        System.out.println(resultList);
    }
}
