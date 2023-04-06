package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Category {
    static boolean solution(String s) {
        String [] a = s.split("");
        boolean answer = true;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        if(a[0].equals(")")) answer = false;
        else{
            for(String b : a){

            }
        }



        return answer;
    }

    public static void main(String[] args) throws ParseException {

        String oldstring = "2011-01-18";
        SimpleDateFormat Date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = Date1.parse(oldstring);
        System.out.println(date);

        boolean a = solution(")()(");
        System.out.println(a);
    }
}
