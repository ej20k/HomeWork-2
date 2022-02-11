package com.company;

public class Main {

    public static void main(String[] args) {
        String s= " Featuring Pneumonoultramicroscopicsilicovolcanoconiosis new episodes  each week, in which our hosts take you on exciting journeys";
        String [] word = s.split(" ");
        String maxlethWord = "";
        for(int i = 0; i < word.length; i++){
            if(word[i].length() >= maxlethWord.length()){
                maxlethWord = word[i];
            }
        }
        System.out.println(maxlethWord);
    }
}
