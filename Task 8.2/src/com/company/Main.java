package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String str=" credit card 1234-5678-9000-0000 visa classic";
        Pattern pattern = Pattern.compile("\\S+([0-9]+)");
        Matcher matcher = pattern.matcher(str);
        for(int i = 0 ; i < matcher.groupCount(); i++) {
            matcher.find();
            System.out.println(matcher.group());
        }

}
    }


