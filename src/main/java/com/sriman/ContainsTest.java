package com.sriman;

public class ContainsTest {

    public static final String CHANGE_TYPE_ACCEPT = "PNRMRDIFFMINOR";

    public static void main(String[] args) {

        String changeType = "PNRMRDIFFMINOR_DEP";
        if(changeType.startsWith(CHANGE_TYPE_ACCEPT)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
