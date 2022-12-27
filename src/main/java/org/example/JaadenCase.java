package org.example;

import java.util.List;
import java.util.StringTokenizer;

public class JaadenCase {
    public static String solution(String s) {

        StringTokenizer st = new StringTokenizer(s," ",true);
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()){
//            if(st.equals(" ")){
//                sb.append(" ");
//            } else{
//                String a = st.nextToken();
//                a = a.toLowerCase();
//                a = a.substring(0,1).toUpperCase() + a.substring(1);
//                sb.append(a);
//            }
            System.out.println(st.nextToken());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = solution("3people Unfollowed Me");
        System.out.println(s);
    }
}
